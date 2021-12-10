package Loops;

import java.util.Scanner;

public class whilePractice3 {
    public static void main(String[] args) {
        // ask th user to enter an int value and find the divisor of the given number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an number");
        int inputNumber = scanner.nextInt();
        int divisor = 1;

        while (divisor <= inputNumber) {

            if (inputNumber % divisor == 0) {
                System.out.println(divisor + " is divisor of " + inputNumber);

            }

            divisor++;

        }
    }
}


