import java.util.*;

public class arrayc1{
    public static int binarySearch(int numbers[], int key){
    
        int start = 0;
        int end = numbers.length - 1 ;
        while (start<=end) {
            int mid = start + (end - start )/2;
            if (key == numbers[mid]){
                return mid;
            }
            if(key > numbers[mid]){
                start = mid+1; //move right
            }else{
                end = mid -1 ; // move left
            }
       }
       return -1;
    }
    public static int linearSearch(int [] nums, int target){
        for(int i =0; i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14,16};
        int key = 14;
        System.out.println( "Key is at index :"+ binarySearch(numbers, key));
        int index = binarySearch(numbers, key);
        if(index == -1 ){
            System.out.println("Key is not in the array");
        }

        int[] nums = {2,3,5,6,8,10};
		int target = 8;
		int indx = linearSearch(nums, target);
		System.out.println("key is at index : " + indx);
        if(indx == -1 ){
            System.out.println("Key not found");
        }

    }
}
