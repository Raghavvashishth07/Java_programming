package strings_java;

import java.util.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder str = new StringBuilder("hello");

        // Append a string to the end
        str.append(" world");
        System.out.println("After append: " + str);

        // Insert a character or string at a specific position
        str.insert(5, ",");
        System.out.println("After insert: " + str);

        // Set a specific character at a given index
        str.setCharAt(0, 'H'); // Change 'h' to 'H'
        System.out.println("After setCharAt: " + str);

        // Delete a character at a specific index
        str.deleteCharAt(5); // Remove ','
        System.out.println("After deleteCharAt: " + str);

        // Delete a substring between two indices
        str.delete(5, 11); // Removes " world"
        System.out.println("After delete: " + str);

        // Reverse the entire string
        str.reverse();
        System.out.println("After reverse: " + str);

        // Replace a substring with another string
        str.reverse(); // Revert to original for clarity
        str.replace(0, 5, "HELLO"); // Replaces "hello" with "HELLO"
        System.out.println("After replace: " + str);

        // Find the length of the StringBuilder
        int length = str.length();
        System.out.println("Length: " + length);

        // Find the capacity of the StringBuilder
        int capacity = str.capacity();
        System.out.println("Capacity: " + capacity);

        // Ensure a minimum capacity
        str.ensureCapacity(50); // Increases capacity if less than 50
        System.out.println("New capacity: " + str.capacity());

        // Trim the capacity to the current length
        str.trimToSize();
        System.out.println("Trimmed capacity: " + str.capacity());

        // Retrieve a character at a specific index
        char charAt2 = str.charAt(2);
        System.out.println("Character at index 2: " + charAt2);

        // Get a substring from the StringBuilder
        String substring = str.substring(0, 5);
        System.out.println("Substring: " + substring);

        // Convert to a regular String
        String finalString = str.toString();
        System.out.println("Converted to String: " + finalString);

        // Create another StringBuilder to demonstrate chaining
        StringBuilder sb = new StringBuilder("physics is good");
        sb.delete(0, 8).append("awesome!");
        System.out.println("Modified string (chained): " + sb);
    }
}
