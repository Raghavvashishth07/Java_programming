

class Animal {
    Animal(){
        System.out.println("you are calling an animal");
    }
    void walk() {
        System.out.println("Animal walks in its own way");
    }

    void eats() {
        System.out.println("Animal eats food");
    }
}

class Tiger extends Animal {
    Tiger(){
        System.out.println("Animal you have called is tiger");
    }
    @Override
    void walk() {
        System.out.println("Tiger has 4 legs");
    }
}

class Chicken extends Animal {
     Chicken(){
        System.out.println("Animal you have called is Chicken");
    }
    @Override
    void walk() {
        System.out.println("Chicken has 2 legs");
    }
}

public class Abstraction_oops {
    public static void main(String[] args) {
        Animal a1 = new Tiger();
        a1.walk();
        a1.eats();

        Animal a2 = new Chicken();
        a2.walk();
        a2.eats();
    }
}
