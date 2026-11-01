import java.util.*;

public class tSum{
    int nums [] ={2,7,11,5};
    public static int[] twoSum(int [] nums , int target){
         
        for(int i=0;i<nums.length;i++){
            int k = nums.length -1;
            int T2sum;
            for(int j=k;j>=0;j--){
                T2sum =  nums[i] + nums[k];
                if(T2sum == target){
                    System.out.println("on the index of :" + "[" + i + ","+ k + "]");
                    break;
                }else{
                    continue;

                }
            }
            
        }
    }    public static void main(String[] args) {
      
        twoSum(nums[], 9);
   }
}