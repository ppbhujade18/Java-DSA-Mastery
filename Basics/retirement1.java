import java.util.*;

public class retirement1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("How much money do you need to retire ?");
        double goal = sc.nextDouble();

        System.out.println("How much money you will contribute every year ?");
        double payment = sc.nextDouble();

        System.out.println("Enter Interest Rate ?");
        double interestRate = sc.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance<goal) {
            balance += payment;
            double interest = balance * interestRate/100;
            balance += interest;
            years++;
            
        }
        System.out.println("You can retire in " + years + " years" );

    }
}
