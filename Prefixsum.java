import java.util.*;
public class Prefixsum {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }

    static int[] prefixSum(int[] arr){
        int n=arr.length;
        int ans[]=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        System.out.println("enter array element: ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array: ");
        printArray(arr);
        
        System.out.println("prefixsum array--: ");

        int pref[]=prefixSum(arr);
        printArray(pref);
        
    }
}
