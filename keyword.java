class Student {
    String name;                  // Instance variable (per object)
    static String school;         // Static variable (shared by all)

    // Static method to change school name
    public static void changeSchoolName(String newSchool) {
        school = newSchool;
    }
}

public class keyword {
    public static void main(String[] args) {
        // Setting static variable without creating object
        Student.school = "JMV";  

        // Creating object
        Student s1 = new Student();
        s1.name = "Tony";

        System.out.println("Student name: " + s1.name);
        System.out.println("School before change: " + Student.school);

        // Correct way: call static method using class name
        Student.changeSchoolName("New School");

        System.out.println("School after change: " + Student.school);
    }
}
