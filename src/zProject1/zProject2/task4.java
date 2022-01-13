package zProject1.zProject2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
// . Write a program that will accept only 6 digits
//numbers like 578432 and find multiplication
//(5*7*8*4*3*2) of all digits and sum
//(5+7+8+4+3+2)of all digits.
//Example 1:
//578432
//Multiplication of all digits is 6720
//The Sum of all digits is 29
//Description

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 6 digits number");   //578432
        int number = scanner.nextInt();

        int num1 = number / 10;
        int remainder1 = number % 10;  //2
        int num2 = num1 /10;
        int remainder2 = num1 % 10;  //3
        int num3 = num2 / 10;
        int remainder3 = num2 % 10;  //4
        int num4 = num3 / 10;
        int remainder4 = num3 % 10;  //8
        int num5 = num4 / 10;
        int remainder5 = num4 % 10;
        int remainder6 = num5 % 10;

        int total1 = remainder1 * remainder2 * remainder3 * remainder4 * remainder5 * remainder6;
        int total2 = remainder1 + remainder2 + remainder3 + remainder4 + remainder5 + remainder6;

        System.out.println(total1);
        System.out.println(total2);

//        System.out.println(remainder1);
//        System.out.println(remainder2);
//        System.out.println(remainder3);
//        System.out.println(remainder4);
//        System.out.println(remainder5);
//        System.out.println(remainder6);


    }
}
