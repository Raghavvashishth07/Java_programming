// File: Bank.java
package oops_java;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();

        // ✅ Public
        account1.name = "Khata";   
        System.out.println("Name: " + account1.name);

        // ✅ Protected (same package)
        account1.email = "abc@gmail.com";
        System.out.println("Email: " + account1.email);

        // ✅ Default (same package)
        account1.branch = "Ambala";
        System.out.println("Branch: " + account1.branch);

        // ❌ Private - cannot access directly
        // account1.password = "12345";  // ERROR: password has private access

        // ✅ But can access via public methods
        account1.setPassword("12345");
        System.out.println("Password via getter: " + account1.getPassword());
    }
}
