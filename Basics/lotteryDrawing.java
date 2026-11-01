import java.util.*;

public class lotteryDrawing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw ?");

        int k = sc.nextInt();
        System.out.println("what is the highest number you can draw ");
        int n = sc.nextInt();

        int [] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]= i+1; // fill an array with numbers 1 2 3 . . . n
21 int[]
        }
        int [] result = new int[k]; //draw k numbers and put them into a second array
        for(int i=0;i<result.length;i++){

            int r = (int) (Math.random()*n); // make a random index between 0 and n - 1
            result[i] = numbers[r]; // pick the element at the random location
            numbers[r] = numbers[n-1]; // move the last element into the random location
            n--;

        }
        //// print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination . it will make you rich");
        for(int r:result)
        System.out.println(r);
    }
}