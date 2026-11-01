import java.util.*;

public class sort{
    public static void bubblesort(int arr[]){
        boolean swap;
        for(int turn =0 ;turn<arr.length-1 ;turn++){
            swap = false;
           
            for(int j=0 ; j<arr.length-1-turn;j++){
                if (arr[j]>arr[j+1]){
                    // swap 
                    int temp = arr[j];  
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                    
                }
            }
            if (!swap) {
                break;
            }
            
        }
        
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length;j++){
                if (arr[minIndex]>arr[j]) {// if need of decreasing order then if (arr[minIndex]<arr[j])
                    minIndex = j;
                    
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionSot(int arr[]){

        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev>=0  && arr[prev]>curr) {
                arr[prev+1] =arr[prev];
                prev--;
                
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void printarr(int arr []){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        //bubblesort(arr);

        //selectionSort(arr);
        insertionSot(arr);
        printarr(arr);
        
    }

}
