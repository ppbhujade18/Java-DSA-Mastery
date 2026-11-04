import java.util.*;

public class stringBuild{
    
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("");
        
        for(char ch='a';ch <='z'; ch++){  // time complexity O(n) = O(26)
            st.append(ch + " ");

        }
        System.out.println(st);
        
    }
}