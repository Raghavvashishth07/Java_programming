package BinarySearch;

public class firstocc {
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int fo=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target){
                fo=mid;
                //for first occurence--high=mid-1;
                //for last occurence--
                low=mid+1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr={5,5,5,5,5,5,7,25,108};
        int[] arr1={2,3,4,5,5,5,5,5,5,5};
        int target=5;
        int result=binarySearch(arr1,target) ;
        System.out.println("last occurence of "+target+" is at index: "+result);
    }
}
