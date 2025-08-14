package BinarySearch;

public class binarySearch {

    //ITERATIVE----
    static int binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    //RECURSIVE--

    static boolean recBs(int[] arr,int st,int end,int val){
        if(st>end) return false;
        int mid=st+(end-st)/2;
        if(arr[mid]==val) return true;
        else if(arr[mid]>val){
            return recBs(arr,st,mid-1,val);
        }
        else{
            return recBs(arr,mid+1,end,val);
        }
    }

    public static void main(String[] args) {
       int[] arr={2,3,5,8,15,23,28,35,43};
       int target=0;
    //    int result=binarySearch(arr,target);
       while(target!=10){
           System.out.printf("%d exists in array %b\n",target,recBs(arr,0,arr.length-1, target));
           target ++;
       }
    //    if(result==-1) System.out.println( result+" --element not found");
    //    else System.out.println("element found at index-- "+ result);    
    }
}
