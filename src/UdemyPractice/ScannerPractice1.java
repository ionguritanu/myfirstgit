package UdemyPractice;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("What is your senior quote? ");
        String quote = scanner.next();
        quote += scanner.nextLine();
        System.out.println(quote);

        System.out.println("Thank you " + name + " You are " + age + " and your senior quote is " + quote);



    }
}
