package Sorting_algorithms;

public class quicksort4 {
 // Helper function to swap elements
 static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

// Partition function to arrange elements around the pivot
static int partition(int[] arr, int st, int end) {
    // Choose the pivot (let's choose the first element here)
    int pivot = arr[st];
    int pi = st - 1; // This will track the partition index

    // Iterate through the array and place smaller elements on the left of the pivot
    for (int i = st; i <= end; i++) {
        if (arr[i] <= pivot) {
            pi++;
            swap(arr, pi, i);
        }
    }
    
    // Now move the pivot into the correct position
    swap(arr, pi, st);

    return pi; // Return the index where the pivot is placed
}

// The quickSort function to recursively sort the array
static void quickSort(int[] arr, int st, int end) {
    if (st < end) {
        int pi = partition(arr, st, end); // Get the partition index
        quickSort(arr, st, pi - 1); // Recursively sort the left part
        quickSort(arr, pi + 1, end); // Recursively sort the right part
    }
}

public static void main(String[] args) {
    int[] arr = {7, 13, 8, 5, 10, 2, 4};
    int st = 0;
    int end = arr.length - 1;

    quickSort(arr, st, end);

    // Print the sorted array
    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}