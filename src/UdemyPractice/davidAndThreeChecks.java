package UdemyPractice;

import java.util.Scanner;

public class davidAndThreeChecks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double balance = 200;

        System.out.println("How much is your balance");   //(610, 385, 975)
        double firstCheck = scanner.nextDouble();
         balance += firstCheck;

        System.out.println("How much is your balance");
        double secondCheck = scanner.nextDouble();
        balance += secondCheck;

        System.out.println("How much is your balance");
        double thirdCheck = scanner.nextDouble();
        balance += thirdCheck;

        System.out.println("How much is the phone");
        double phonePrice = scanner.nextDouble();
        balance -= phonePrice;

        System.out.println("How much is the headphone");
        double headphonePrice = scanner.nextDouble();
        balance -= headphonePrice;

        System.out.println("Your final balance is " + balance);








    }
}
