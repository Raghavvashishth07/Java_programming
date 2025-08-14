package Stacks;
import java.util.*;

public class stack_01 {
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
        System.out.println(st.peek());

        Stack<Integer> gt=new Stack<>();
        for(int i=0;i<n;i++){
            gt.push(st.pop());
        }
        System.out.println("gt is ---"+gt);
        

        Stack<Integer> rt=new Stack<>();
        for(int i=0;i<n;i++){
            rt.push(gt.pop());
        }
        System.out.println("copy stack is ---"+rt);

    }
}
