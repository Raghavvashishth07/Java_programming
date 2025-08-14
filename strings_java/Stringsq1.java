package strings_java;

import java.util.*;

public class Stringsq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string from the user
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("Original String: " + str);
        
        // Iterate through each character of the StringBuilder
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase
                ch = Character.toUpperCase(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase
                ch = Character.toLowerCase(ch);
            }
            str.setCharAt(i, ch);  // Update the character in StringBuilder
        }

        System.out.println("Modified String: " + str);
    }
}
