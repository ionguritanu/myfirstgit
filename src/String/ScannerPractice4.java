package String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        //Example1
        /* ask user to enter an integer number
           we will find out if this is an even number or not
           input is 7
           output 7 is even number false
           input is 8
           output 8 is even number true
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pleas enter a integer number ");
//        int number = scanner.nextInt();
//
//         /*if reminder with 2 gives you 0 this is even number;
//           otherwise is odd number;*/
//
//        boolean isEven = number%2 == 0;
//        System.out.println(number + " is even number " + isEven);

        // Example2
        /* ask user to enter two integer number
           first integer you provide should be bigger than second one
           If the first number is bigger than second one we will print out true
           If second number bigger first number we will print out falls
         */

//        System.out.println("Please enter your first integer number ");
//        int firstNUmber = scanner.nextInt();
//        System.out.println("Please enter an integer but smaller than first one ");
//        int secondNumber = scanner.nextInt();
//        boolean isFirstBigger = firstNUmber > secondNumber;
//        System.out.println(isFirstBigger);

        //Example3
        /*to be able to graduate from school student needs
          %85 attendancy
          80 or higher grade
          %70 of the homework
          create a program for teacher and teacher will enter all this variables and
          if the student PASS it will print TRUE for teacher
          if student FAILS it will print FALSE for teacher
         */
        System.out.println("Please enter your attendancy ");
        int attendency = scanner.nextInt();
        System.out.println( "Please enter your grade ");
        int grade = scanner.nextInt();
        System.out.println("Please enter your homework ");
        int homework = scanner.nextInt();
        boolean studentPass = attendency >= 86 && grade >= 80 && homework >= 70;
        System.out.println(studentPass);
    }
}
