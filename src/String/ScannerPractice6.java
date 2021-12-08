package String;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*-deposit money for David
	create a new class: MoneyTransaction
	David wants to deposit his paychecks into his account and already has $200
	He has 3 paychecks (610, 385, 975)
	he can only deposit one check at a time
	*Ask: "How much is Deposit amount?" every time he is making deposit
	after all of paycheks deposited in to account
	he bought a phone for $599 and headphone for $299
	*Ask: How much is phone?
	*Ask: How much is headPhone?
	Calculate his final money and print --> "Your final balance is <finalAmount>"
         */

        Scanner input = new Scanner(System.in);
        double balance = 200;

        System.out.println("How much is the amount");
        double firstCheck= input.nextDouble();
        balance += firstCheck;

        System.out.println("How much is the amount");
        double secondCheck= input.nextDouble();
        balance += secondCheck;

        System.out.println("How much is the amount");
        double thirdCheck= input.nextDouble();
        balance += thirdCheck;

        System.out.println("How much is the phone? please enter the amount ");
        double phone$ = input.nextDouble();
        balance -= phone$;

        System.out.println("How much is the headPhone? please enter the amount");
        double headPhone = input.nextDouble();
        balance -= headPhone;
        System.out.println("Your final balance is " + balance);



//        System.out.println("David, how much money you deposit? ");
//        int deposit1 = scanner.nextInt();
//        System.out.println(200 + deposit1);
//
//        System.out.println("David , how much money you deposit 2nd time");
//        int deposit2 = scanner.nextInt();
//        System.out.println(200 + deposit2);
//
//        System.out.println("David , how much money you deposit 2nd time");
//        int deposit3 = scanner.nextInt();
//        System.out.println(200 + deposit3);



    }
}
