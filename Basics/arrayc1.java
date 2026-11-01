import java.util.*;

public class arrayc1{
    public static int binarySearch(int numbers[], int key){
        /*
        binary search 
        2|4|6|8|10|12|14|16|
        key =12 
        initiate start and end 
        mid = start + end /2
        compare mid with key 
        key>mid >> move right start ++
        key < mid >> move left end --
        key == mid then print index

        */
        int start = 0;
        int end = numbers.length;
        while (start<=end) {
        int mid = (start + end )/2;
        if (key == numbers[mid]) {
            return mid;
        }
        if(key > numbers[mid]){
            //update start moves right
            start++;
        }
        if(key<numbers[mid]){
            end--;
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

    }
}