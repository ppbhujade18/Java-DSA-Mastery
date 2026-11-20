
// ##leetcode hard problem which i solved earlier, but i solved on leetcode today
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining. 
public class Rainwater {
    public static int trap(int[] height) {
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);

        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i= n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;

        for(int i =0;i<n;i++){
            int waterlvl = Math.min(rightmax[i], leftmax[i]);

            trappedwater += (waterlvl - height[i]);
        }
        return trappedwater;
    }

    public static void main(String args[]){
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}