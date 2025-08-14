import java.util.*;
public class pairsum {

    static int pairSum(int[] arr,int size,int x){
        int count=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==x){
                count++;
            }

        }
       }
       return count;
    }

    static int tripletSum(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int checkUnique(int[] arr){
        int ans=-1;
        
       for(int i=0;i<arr.length;i++){
          int count=0;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                if(count>0){
               break;
                }
            }
        }
        if(count==0){
            ans=arr[i];
            break;
           }
       }
       return ans;
    }

    static int secondMax(int []arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        return smax;

    }

    static int firstRepeatElement(int []arr){
        int count=0;
        int ans=-1;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                break;
            }
        }
        if(count>=1){
            ans= arr[i];
            break;
       }
    }
       return ans;         
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int [] arr=new int[size];
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println("\n");

      System.out.println("total pairs in two pair are : "+pairSum(arr,size,12));
      System.out.println("total pairs in triplet are: "+tripletSum(arr,12));
      System.out.println("unique element is: "+checkUnique(arr));
      System.out.println("secondMax element is: "+secondMax(arr));
      System.out.println("first repeating ele is: "+firstRepeatElement(arr));



    }
}
