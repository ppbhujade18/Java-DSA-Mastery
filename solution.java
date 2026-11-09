/*1108. Defanging an IP Address
Solved
Easy
Topics
premium lock icon
Companies
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:

The given address is a valid IPv4 address.
 */
public class solution {
    public static String defangIPaddr(String address) {
        StringBuilder st = new StringBuilder("");

        for(int i=0 ; i<address.length();i++){
            if(i<address.length()-1 && address.charAt(i) == '.'){

                st.append("[.]");

            }
            else{
                st.append(address.charAt(i));
            }
        }

        return st.toString();
    }
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
}
