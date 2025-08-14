package hashmaps;
import java.util.*;

public class hm1 {
    public static void main(String[] args) {
        
        // Example: Student names as keys and their marks as values
        Map<String, Integer> studentMarks = new HashMap<>();

        // put(): Adding entries to the map
        studentMarks.put("Yash", 85);
        studentMarks.put("Aman", 92);
        studentMarks.put("Neha", 76);
        studentMarks.put("Riya", 89);
        studentMarks.put("Karan", 95);

        // get(): Fetch value using key
        System.out.println("Marks of Aman: " + studentMarks.get("Aman")); // 92
        System.out.println("Marks of Rahul (not present): " + studentMarks.get("Rahul")); // null

        // containsKey(): Check if a student exists
        System.out.println("Is Neha in the list? " + studentMarks.containsKey("Neha")); // true

        // containsValue(): Check if a specific mark exists
        System.out.println("Is there a student with 95 marks? " + studentMarks.containsValue(95)); // true

        // remove(): Remove an entry
        studentMarks.remove("Riya");
        System.out.println("After removing Riya: " + studentMarks);

        // size(): Total number of students
        System.out.println("Total students: " + studentMarks.size());

        // isEmpty(): Check if map is empty
        System.out.println("Is the student map empty? " + studentMarks.isEmpty());

        // --- Traversal Method 1: Using keySet() ---
        System.out.println("\nTraversal using keySet():");
        for (String key : studentMarks.keySet()) {
            System.out.println(key + " => " + studentMarks.get(key));
        }

        // --- Traversal Method 2: Using entrySet() with var ---
        System.out.println("\nTraversal using entrySet() with var:");
        for (var entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // --- Traversal Method 3: Using values() only ---
        System.out.println("\nTraversal using values() only:");
        for (Integer mark : studentMarks.values()) {
            System.out.println("Mark: " + mark);
        }

        // clear(): Remove all entries
        studentMarks.clear();
        System.out.println("\nAfter clearing the map: " + studentMarks);
    }
}
