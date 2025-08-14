package Stacks;
import java.util.*;

public class stack_02 {



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of stack: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
           int x=sc.nextInt();
           st.push(x);
        }
        System.out.println(st);
        System.out.print("peak element is-- ");
        System.out.println(st.peek());

        Stack<Integer> gt=new Stack<>();
        for(int i=0;i<n;i++){
            gt.push(st.pop());
        }

        System.out.println("gt is ---"+gt);

        st.push(101);
        for(int i=0;i<n;i++){
            st.push(gt.pop());
        }
        
        System.out.println(st);

        // Stack<Integer> rt=new Stack<>();
        // for(int i=0;i<n;i++){
        //     rt.push(gt.pop());
        // }
        // System.out.println("copy stack is ---"+rt);

    }
}
