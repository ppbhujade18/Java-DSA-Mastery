import java.util.*;

public class Oops{
    public static void main(String[] args) {
        // Object Creation
        bankAccount myacc = new bankAccount();
        
        // Using Setters
        myacc.setusername("ppbhuj18");
        myacc.setPassword("ppbhuj18");
        
        // Accessing public data directly
        System.out.println(myacc.username);
        
        // Performing actions using methods
        System.out.print("updated balance after deposit : ");
        myacc.depositMoney(10000);
        
        System.out.print("updated balance after withdrawing : ");
        myacc.withdrawMoney(1000);
    }
}

class bankAccount{
    String username; // Public (accessible everywhere)
    private String password; // Private (Encapsulation: accessible only inside this class)
    int balance = 0; // Default balance

    // Setter for username
    void setusername(String newusername){
        username = newusername;
    }

    // Setter for password (Using 'this' keyword to resolve variable shadowing)
    public void setPassword(String password) {
        this.password = password;
    } 

    void depositMoney(int deposit){
        balance += deposit;
        System.out.println(balance);
    }

    void withdrawMoney(int withdraw){
        balance = balance - withdraw;
        System.out.println(balance);
    }
}
