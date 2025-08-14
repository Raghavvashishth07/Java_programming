import java.util.*;

public class twopointer {

    // Function to return a sorted array of squares
    static int[] squareinc(int[] arr, int left, int right) {
        int[] result = new int[arr.length];
        int k = arr.length - 1; // Start filling from the end

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                result[k--] = arr[left] * arr[left];
                left++;
            } else {
                result[k--] = arr[right] * arr[right];
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // First question: Separate even and odd numbers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int eveele = 0;
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ans[eveele++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ans[eveele++] = arr[i];
            }
        }

        // Print rearranged even-odd array
        System.out.println("Rearranged Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        // Second question: Sort the squared values of arr2
        int[] arr2 = {-10, -5, -3, 1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr2.length;
        int left = 0, right = n - 1;

        int[] squaredArray = squareinc(arr2, left, right);

        // Print squared and sorted array
        System.out.println("Squared Array:");
        for (int num : squaredArray) {
            System.out.print(num + " ");
        }
    }
}
