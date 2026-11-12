import java.util.*;

public class string1{
    
    public static String toUpperCase(String str){ // convert each letter of word into uppercase
        StringBuilder st = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));

        st.append(ch);

        for(int i =1 ; i<str.length();i++){
            if (str.charAt(i) ==  ' ' && i<str.length()-1) {
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));

            }else{
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String str = "hii i'm pranav ";
        System.out.println(toUpperCase(str));

        

    }
    
}
