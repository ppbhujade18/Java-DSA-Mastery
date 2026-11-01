import java.util.*;

public class tSum {
    public static void twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i= 0;i<n;i++){
            for(int j = i+1; j<n;j++){
                
                if(nums[i] + nums[j] == target){
                    System.out.println("[" + nums[i] + "," + nums[j]+ "]");
                }
                
            }
        }
    }

   public static void main(String[] args) {
    int nums [] = {2,3,9,11,7};
    int target = 20;
    twoSum(nums, target);
   }
}
