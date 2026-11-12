
public class String2{


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
        String str1 = "aaabbbcccdd";
        System.out.println("Compressed String : "+ tocompress(str1));
        
    }
    
}