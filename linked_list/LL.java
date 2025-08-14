package linked_list;

import java.util.*;

public class LL {
    public static void main(String[] args) {
        // Create a new LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // Add elements at the end of the list
        list.addFirst("this");
        list.add("is");
        list.add("a");
        list.add("list");

        // Print the LinkedList
        System.out.println("Initial list: " + list);

        // Access elements at specific positions
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at first: " + list.getFirst());
        System.out.println("Element at last: " + list.getLast());

        // Add elements at specific positions
        list.add(2, "new");
        System.out.println("After adding 'new' at index 2: " + list);

        // Remove elements from the list
        list.remove("a");  // Removes the first occurrence of "a"
        list.removeFirst();  // Removes the first element
        list.removeLast();  // Removes the last element
        System.out.println("After removing 'a', first and last: " + list);

        // Add an element at the beginning
        list.addFirst("beginning");
        System.out.println("After adding 'beginning' at first: " + list);

        // Add an element at the end
        list.addLast("end");
        System.out.println("After adding 'end' at last: " + list);

        // Check if list contains a specific element
        System.out.println("List contains 'is': " + list.contains("is"));
        System.out.println("List contains 'a': " + list.contains("a"));

        // Get the size of the list
        System.out.println("Size of the list: " + list.size());

        // Iterating through the list using a for-each loop
        System.out.print("Iterating through the list: ");
        for (String item : list) {
            System.out.print(item + " --> ");
        }
        System.out.println("Null");

        // Check if list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        // Clear the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
