import java.util.*;

public class retirement2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Much money will you contribute every year ?");
        double payment = sc.nextDouble();

        System.out.println("Enter Interest Rate ?");
        double interestRate = sc.nextDouble();

        double balance = 0;
        int year = 0;
        String input ;

        do{
            balance += payment;
            double Interest = balance * interestRate/100;
            balance += Interest;
            year++;
            System.out.println("After "+ year + " years, your Balance is "+ balance  );
            System.out.println("Are you ready to retire now ? (Y / N)");
            input = sc.next();

        }
        while(input.equals("N"));

    }
}