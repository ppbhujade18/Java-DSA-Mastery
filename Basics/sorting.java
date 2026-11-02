import java.util.Arrays;  // for in built function of sorting array also use for array inbuilt functions 
import java.util.Collections;  //collections used for reverse order array
public class sorting{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " "); 
        }
        System.out.println();
    }
    public static void printRevarr(Integer arr1[]){
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr [] = {5,4,3,6,9,7,8,1};
        Integer arr1 [] = {5,4,3,6,9,7,8,1}; // use Integer as object type variable because basic primitive variable cannot used in this method

        Arrays.sort(arr); //sort an array in increasing order
        //Arrays.sort(arr, 0, 5); // only 4 element sort, remaining element as it is

        printarr(arr);

        Arrays.sort(arr1, Collections.reverseOrder()); //for decreasing order
        printRevarr(arr1);

        //Arrays.sort(arr1,0,5, Collections.reverseOrder()); // only 4 element will be sort in decreasing order.
        //printRevarr(arr1);
    }
}
