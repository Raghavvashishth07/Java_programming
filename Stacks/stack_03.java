// package Stacks;
// import java.util.*;
// public class stack_03 {

//     public static void displayreverserec(Stack<Integer> s){
//         if(s.size()==0) return;
//         int top=s.pop();
//         System.out.print(top+" ");
//         displayreverserec(s);
//         s.push(top);
//     }

//     public static void displayrec(Stack<Integer> s){
//         if(s.size()==0) return;
//         int top=s.pop();
//         displayrec(s);
//         System.out.print(top+" ");
//         s.push(top);
//     }

//     public static void push_at_bottom(Stack<Integer> s,int val){
//         if(s.isEmpty()){
//             s.push(5);
//             // return;
//             return;
//         }
//         int top=s.pop();
//         push_at_bottom(s,val);
//         System.out.print(top+" ");
//         s.push(top);
        

//     }
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         Scanner sc=new Scanner(System.in);

//         System.out.print("enter the size of stack: ");
//         int n=sc.nextInt();

//         for(int i=0;i<n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//         }
         
//         // displayreverserec(st);
//         // displayrec(st);
//         push_at_bottom(st);

//     }
// }
package Stacks;
import java.util.*;

public class stack_03 {

    // Function to display stack elements in reverse order (recursive)
    public static void displayReverseRec(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int top = s.pop();
        System.out.print(top + " ");
        displayReverseRec(s);
        s.push(top); // Restore original stack
    }

    // Function to display stack elements in normal order (recursive)
    public static void displayRec(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int top = s.pop();
        displayRec(s);
        System.out.print(top + " ");
        s.push(top); // Restore original stack
    }

    // Function to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int val) {
        if (s.isEmpty()) {
            s.push(val);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, val);
        s.push(top); // Restore original stack
    }

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

        System.out.print("Enter value to push at bottom: ");
        int val = sc.nextInt();

        pushAtBottom(st, val);

        System.out.println("Stack after pushing at bottom:");
        displayRec(st);

        sc.close();
    }
}
