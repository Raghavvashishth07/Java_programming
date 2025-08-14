package Sorting_algorithms;

public class bubblesort1 {
    static void bubblesort(int[] arr) {
        int n = arr.length;
        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            // /passes will be always n-1;
            for (int j = 0; j < n - i - 1; j++) {
                // last i elements are sorted already so no need to check them again
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3 };
        bubblesort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
