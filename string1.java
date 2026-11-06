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

    public static String tocompress(String str1){
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<str1.length();i++){  // String compressing
            
            Integer count =1;
            while( i<str1.length() -1 && str1.charAt(i)== str1.charAt(i+1)) {
                count++;
                i++;

            }
            sb.append(str1.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hii i'm pranav ";
        String str1 = "aaabbbcccdd";
        System.out.println("Compressed String : "+ tocompress(str1));
        System.out.println(toUpperCase(str));

        

    }
    
}
