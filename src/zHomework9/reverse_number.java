package zHomework9;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        //Write a program in Java to display any number in reverse order.
        // Please look examples below carefully.
        //Test Data : Input : 12345 (it can be any number like 5 digits or 6 digits etc) Expected Output : 54321
        //Input : 765432 Expected Output : 234567
        //Input : 23914 Expected Output : 41932

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = input.nextInt();
        int reversed = 0;

        while (number != 0)  {          // we're doing the process until given number is 0

            int separateDigit = number % 10; // getting last digit from given number

            reversed = reversed * 10 + separateDigit;

            number /= 10;                    // removing the last digit from the given number
        }
        System.out.println(reversed);
//
    }
}
