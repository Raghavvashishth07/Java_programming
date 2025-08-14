package strings_java;
import java.util.*;

public class validpalindrome {

    public static boolean isPalindrome(String s) {
        String cleanedstr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = cleanedstr.length() - 1;

        while (i < j) {
            if (cleanedstr.charAt(i) != cleanedstr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome("")); // true
        System.out.println(isPalindrome("0P")); // false

    }
}
