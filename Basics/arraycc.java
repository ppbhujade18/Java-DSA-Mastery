import java.util.*;
public class arraycc {
    // HOMEWORK PROBLEM 
    public static void printSubarray(int numbers[]){
        int ts = 0;
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int sum =0;
            
            for(int j= i; j<numbers.length;j++){
                
                sum =sum + numbers[j];
                if (max <sum) {
                    max = sum;
                }if(min>sum){
                    min = sum;
                }
                for(int k =i; k<=j;k++){
            
                    System.out.print(numbers[k] + " ");
                }
                
                ts++;
                System.out.println("Sum of subarray is :"+sum );
            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);
        System.out.println("MAX Sum of subarray is :" +max);
        System.out.println("MIN Sum of subarray is :" + min );
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubarray(numbers);

    }
    
}
