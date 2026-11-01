import java.util.*;

///TRAPPED RAIN WATER 

public class water{
    public static int trapRainwater(int height[]){
        int n = height.length;
        //calculate leftmax -array
        int [] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        } 
        //calculate rightmax - array
        int [] rightmax = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }  

        //loop
        //calculate min(leftmax, rightmax) = waterlevel
        //calculate trapped water = waterlevel - height[i] * width (if width is greater than or different then 1)
        int trappedRainwater = 0;

        for(int i =0;i<n;i++){
            int waterlvl = Math.min(leftmax[i],rightmax[i]);
            trappedRainwater += (waterlvl - height[i]);
        }
        return trappedRainwater;
    }
    public static void main(String[] args) {
        int height[] = {10,7,2,3,2,5};
        System.err.println(trapRainwater(height));

    }
}