import java.util.*;

public class Oops{
    public static void main(String[] args) {
        bankAccount myacc = new bankAccount();
        myacc.setusername("ppbhuj18");
        myacc.setPassword("ppbhuj18");
        System.out.println(myacc.username);
        System.out.print("updated balance after deposit : ");
        myacc.depositMoney(10000);
        System.out.print("updated balance after withdrawing : ");
        myacc.withdrawMoney(1000);

    }
}

class bankAccount{
    String username;
    private String password;
    int balance = 0;


    void setusername(String newusername){
        username = newusername;
    }

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