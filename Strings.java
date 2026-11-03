import java.util.*;

public class Strings {
    //1 palindrome noon, dad mom, racecar, madam
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if (str.charAt(i)!= str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    /// Route containing Direction NORTH, SOUTH, EAST, WEST: find shortest path to destination 
    /// N = UPPER SIDE, S= DOWN SIDE, E = RIGHT, W =LEFT 
    
    public static float getShortestPath(String str1){
        int x =0;
        int y =0;        
        for(int i =0;i<str1.length();i++){
            char dir = str1.charAt(i);
            if(dir == 'N') {
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return ((float)Math.sqrt(x2 + y2));
    }

    // print largest string , like alphabetically
    public static void largestString(String days[]){
        String largest = days[0];
        for(int i =1;i<days.length;i++){
            if (largest.compareTo(days[i])<0) {
                largest = days[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String str = "madam"; // String for palindrome

        System.out.println(isPalindrome(str));

        String str1 = "WNEEWESENNEWNNNNN";  //String for shortest path
        
        System.out.println(getShortestPath(str1));

        String days [] = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        largestString(days);
    }
}
