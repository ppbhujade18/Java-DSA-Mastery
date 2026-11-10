import java.util.*;

/* QUESTION FROM LEETCODE 
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input:
int[] nums = new int[]{2, 5, 1, 3, 4, 7};
int n = 3;

Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input:
int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
int n = 4;

Output: [1,4,2,3,3,2,4,1]
Example 3:

Input:
int[] nums = new int[]{1, 1, 2, 2};
int n = 2;

Output: [1,2,1,2]
 

Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3 */


public class shuffleA{
    public static int[] shuffle(int[] nums, int n) {

      int result [] = new int[nums.length];
      int k=0;
      for(int i =0 ; i<n;i++){
        result[k] = nums[i];
        k++;
        result[k] = nums[i+n];
        k++;
      }  
      
      return result;
    }
    public static void main(String[] args) {
      int [] nums = {2, 5, 1, 3, 4, 7};
      int n = nums.length/2; 
      int shuffleArray[] = shuffle(nums, n);

      //printing shuffled Array
      for(int i=0;i<nums.length;i++){
        System.out.print(shuffleArray[i]+ " ");
      }
    }
}