package Sorting_algorithms;

public class selectionsort2{
      
    // Function to perform Selection Sort on an array
    static void selectionSort(int[] arr) {
        int n = arr.length; // Get the size of the array
        
        // Outer loop to move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum
            
            // Inner loop to find the minimum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[minIndex]) { // If a smaller element is found
                    minIndex = j; // Update the index of the minimum element
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted subarray
            if (minIndex != i) { // Swap only if a smaller element is found
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Sample input array
        int[] arr = {7, 4, 5, 1, 2};
        
        // Call the selectionSort function to sort the array
        selectionSort(arr);
        
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
