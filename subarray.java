import java.util.*;

public class subarray {
    public static void maxSubarraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix [] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i =1 ; i<numbers.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                // for(int k =start;k<=end;k++){
                //     currsum += numbers[k]; /// without using 3rd for loop we improve time complexity = O(n^2) //previously it was O(n^3)
                // }

                if (maxsum<currsum) {
                    maxsum = currsum;
                }
                // System.out.println(currsum);
            }
        }
        System.out.println("Maximum sum of subarray is: " + maxsum);
    }
    public static void kadanes(int numbers[]){// used KADANES algorithm for improving time complexity // now its O(n)
        int cs= 0;
        int ms = Integer.MIN_VALUE;
                                                     
        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Maximum subarray sum is : " + ms);
    }
    public static void maxsubarraysumNe(int nums[]){ // home work some with special method for all negative integers which gives smallest negative integers as max subarray sum
        int mx =Integer.MIN_VALUE;
        int cursum = 0;
        for(int i =0 ;i<nums.length;i++){
            cursum = cursum + nums[i];

            if (mx < cursum) {
                mx =cursum;
            }
        }
        System.out.println("Maximum subarray sum is : " + mx);
    } 

    public static void main(String[] args) {
        int nums [] = { -2, -8,-3,-4,-1,-5};

        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        //int numbers[] = {1,-2,6,-1,3};
        //maxSubarraySum(numbers);
        kadanes(numbers);
        maxsubarraysumNe(nums);
    }
    
}
