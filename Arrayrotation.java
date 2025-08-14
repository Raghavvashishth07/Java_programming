import java.util.Scanner;

class arrayRotation {

    // Function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to reverse elements from index i to j
    static void reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array and take user input
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the original array
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Input the number of rotation steps
        System.out.print("Enter the number of steps to rotate (k): ");
        int k = sc.nextInt();

        // Adjust k to handle cases where k > size
        k = k % size;
        int n = size;

        // Rotate and print the array
        reverseArray(arr, 0, n - k - 1);  // Adjusted the index
        reverseArray(arr, n - k, n - 1);  // Adjusted the index
        reverseArray(arr, 0, n - 1);      // Adjusted the index

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close(); // Close the scanner to free resources
    }
}
