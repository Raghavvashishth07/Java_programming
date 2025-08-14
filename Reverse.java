import java.util.*;
public class Reverse {
 public static void main(String[] args) {
    ArrayList <Integer> li=new ArrayList<>();
    li.add(1);
    li.add(2);
    li.add(3);
    li.add(4);
    li.add(5);
    System.out.println(li);
    int n=li.size();
    int i=0,j=n-1;
    while(i<j){
        int temp=li.get(i);
        li.set(i,li.get(j));
        li.set(j,temp);
        i++;
        j--;
    }
    System.out.println(li);
 }   
}
