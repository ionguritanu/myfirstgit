package Loops;

import java.util.Scanner;

public class whilePractice4Multiplication {
    public static void main(String[] args) {
        // ask user to provide a whole integer num
        // create a multiplication from 1-10 from the given number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a n umber");
        int number = scanner.nextInt();

        int a = 1;

        while (a <= 10){

            System.out.println(number + " * " + a + " = " + (number * 1) );

            a++;
        }
    }
}
