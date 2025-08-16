// File: Account.java
package oops_java;

public class Account {
    public String name;        // Public: accessible everywhere
    protected String email;    // Protected: accessible in same package and subclasses
    String branch;             // Default: accessible only within same package
    private String password;   // Private: accessible only inside this class

    // setter for password
    public void setPassword(String pwd) {
        this.password = pwd;
    }

    // getter for password (just to test)
    public String getPassword() {
        return this.password;
    }
}
