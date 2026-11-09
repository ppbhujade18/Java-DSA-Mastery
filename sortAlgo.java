import java.util.*;

public class sortAlgo{
  public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            largest = Math.max(largest, arr[i]); //find largest
        }

        int count [] = new int[largest+1];

        for(int i =0 ;i<arr.length;i++){
            count[arr[i]]++;    //  to count frequency of each index
        }
        
        int j =0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {

                arr[j] = i;
                j++; //index of sorted array
                count[i]--; // after pushing it in jth index freq decrease and exit loop when value equal to zero
                
            }
        }
    }

    public static void printarr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        printarr(arr);
    }
}