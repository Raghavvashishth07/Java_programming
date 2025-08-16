package oops_java;
import java.util.*;

/*
    ===== OOP Concepts Covered =====
    1. Class & Object
    2. Methods
    3. Method Overloading (Compile-time Polymorphism)
    4. Constructors (Default, Parameterized, Copy Constructor)
    5. 'this' keyword usage
    6. Instance Variables
    7. Inheritance:
       - Single
       - Multilevel
       - Hierarchical
       - Multiple (via Interfaces)
       - Hybrid (via combination)
    8. Method Overriding (Runtime Polymorphism)
    9. Encapsulation
    10. static keyword
    11. final keyword
    12. super() usage
    13. Abstract Classes
    14. Interfaces
*/

// ---------- Base Class ----------
class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Pen specs: colour-- " + this.colour + " type-- " + this.type);
    }

    // Method overloading
    public void printPen(String colour) {
        this.colour = colour;
        System.out.println("Pen's colour: " + this.colour);
    }
    public void printPen(String type, int a) {
        this.type = type;
        System.out.println("Pen's type: " + this.type);
    }
}

// ---------- Encapsulation Example ----------
class BankAccount {
    private String accountHolder;
    private double balance;

    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) {
        if (balance >= 0) this.balance = balance;
        else System.out.println("Balance can't be negative!");
    }
}

// ---------- Student Class ----------
class Student {
    String name;
    long id;
    static int studentCount = 0;

    public void printInfo() {
        System.out.println("Name: " + this.name + " ID: " + this.id);
    }

    Student() {
        studentCount++;
        System.out.println("Default constructor called.");
    }

    Student(String name, int id) {
        studentCount++;
        this.name = name;
        this.id = id;
    }

    Student(Student s2) {
        studentCount++;
        this.name = s2.name;
        this.id = s2.id;
    }
}

// ---------- Single Inheritance ----------
class Shape {
    public void area() {
        System.out.println("Displaying generic area formula.");
    }
}

class Triangle extends Shape {  // Single inheritance
    @Override
    public void area() {
        System.out.println("Triangle area formula: 0.5 * base * height");
    }
    public void area(int h, int b) {
        System.out.println("Triangle area: " + (0.5 * b * h));
    }
}

// ---------- Multilevel Inheritance ----------
class RightTriangle extends Triangle {
    public void specialProperty() {
        System.out.println("Right Triangle has one 90° angle.");
    }
}

// ---------- Hierarchical Inheritance ----------
class Circle extends Shape {
    @Override
    public void area() {
        System.out.println("Circle area formula: π * r * r");
    }
    public void area(int r) {
        System.out.println("Circle area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Rectangle area formula: length * breadth");
    }
    public void area(int l, int b) {
        System.out.println("Rectangle area: " + (l * b));
    }
}

// ---------- Multiple Inheritance (via Interfaces) ----------
interface Drawable {
    void draw();
}

interface Colorable {
    void setColor(String color);
}

class GraphicObject implements Drawable, Colorable { // Multiple inheritance via interfaces
    private String color;
    public void draw() {
        System.out.println("Drawing object with color: " + color);
    }
    public void setColor(String color) {
        this.color = color;
    }
}

// ---------- Abstract Class Example ----------
abstract class Animal {
    abstract void sound(); // Abstract method
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// ---------- final Keyword Example ----------
final class Constants {
    public static final String COLLEGE_NAME = "ABC University";
}

// ---------- Main Class ----------
public class oops_master {
    public static void main(String[] args) {

        // Object creation
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "ballpoint";
        pen1.write();

        // Default constructor
        Student s1 = new Student();
        s1.name = "Raghav";
        s1.id = 2210992114L;

        // Copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();

        // Method overloading
        pen1.printPen("red");
        pen1.printPen("gel pen", 2);

        // Runtime polymorphism
        Shape shapeRef;
        shapeRef = new Triangle();
        shapeRef.area();
        shapeRef = new Circle();
        shapeRef.area();

        // Single inheritance extra
        Triangle t = new Triangle();
        t.area(3, 4);

        // Multilevel inheritance
        RightTriangle rt = new RightTriangle();
        rt.area(3, 4);
        rt.specialProperty();

        // Hierarchical inheritance
        Rectangle rect = new Rectangle();
        rect.area(5, 7);

        // Multiple inheritance via interfaces
        GraphicObject go = new GraphicObject();
        go.setColor("Green");
        go.draw();

        // Abstract class
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        // Encapsulation
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("John Doe");
        acc.setBalance(5000);
        System.out.println(acc.getAccountHolder() + "'s balance: " + acc.getBalance());

        // Static variable
        System.out.println("Total students created: " + Student.studentCount);

        // final constant usage
        System.out.println("College Name: " + Constants.COLLEGE_NAME);
    }
}

/*
===== Main Points to Remember =====
1. Single inheritance: One class extends another.
2. Multilevel inheritance: Class -> Subclass -> Sub-subclass.
3. Hierarchical inheritance: Multiple subclasses from same parent.
4. Multiple inheritance in Java is only possible with interfaces.
5. Hybrid inheritance = combination of above (possible with interfaces).
6. Overriding = same method signature, different class, runtime decision.
7. `super()` is used to call parent constructor or methods.
8. Abstract classes can have both abstract and normal methods.
9. final class can't be inherited; final method can't be overridden.
10. Always use L for long literals (e.g., 1234567890L).
*/
