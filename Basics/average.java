import java.util.*;
public class average {
    public static void avg(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float avgfor = (num1 + num2 + num3) / 3;
        System.out.println(avgfor);


    }
    public static void main(String[] args) {
        avg();
    }
}
