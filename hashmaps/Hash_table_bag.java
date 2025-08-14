import java.util.*;
public class Hash_table_bag {
    public static void main(String[] args) {
        HashSet<Integer> table=new HashSet<>();
        int [] bag={2,1,1,3,2,3};

        int maxLen=0;
        int currLen=0;
        for(int num:bag){
            
            if(table.contains(num)){
                table.remove(num);
                currLen--;
            }
            else{
                table.add(num);
                currLen++;
                maxLen=Math.max(currLen,maxLen);
            }
            // maxLen=Math.max(currLen,maxLen);
        }
        System.out.println(maxLen);
    }
}
