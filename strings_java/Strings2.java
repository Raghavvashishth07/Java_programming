package strings_java;
import java.util.*;
public class Strings2 {
    public static void main(String[] args) {
        
    
    // String b="hello";
    // String a=b.substring(0,4)+'y'+b.substring(4);
    // System.out.println(a);

    //EQUALS--

    //==

    String str1="hello";
    String str2="hello";
    String str3=new String("hello");
    System.out.println(str1==str3);//false

    // .equals--

    System.out.println(str1.equals(str3));//true
}
}