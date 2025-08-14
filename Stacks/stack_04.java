package Stacks;
import java.util.*;

public class stack_04 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        // Edge Case: If stack is empty, do nothing
        if (!st.isEmpty()) {
            Stack<Integer> gt = new Stack<>();
            
            // Move all elements except the top one to another stack
            while (st.size() > 1) {
                gt.push(st.pop());
            }
            st.pop(); // Remove the top element
            
            // Restore elements back to the original stack
            while (!gt.isEmpty()) {
                st.push(gt.pop());
            }
        }

        // Display the modified stack
        System.out.println("Stack after removing top element: " + st);
        
        sc.close();
    }
}
