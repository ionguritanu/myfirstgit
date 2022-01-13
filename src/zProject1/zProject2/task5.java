package zProject1.zProject2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        //Write a program that will accept 5 digit number and
        //will print reversed number at the end.
        //Example-1:
        //53876
        //The output is 67835
        //Example-2:
        //97352
        //The output is 25379

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter a 5 digit number");
        int number = scanner.nextInt();
        int num1 = number / 10;
        int remainder1 = number % 10;
        int num2 = num1 /10;
        int remainder2 = num1 % 10;
        int num3 = num2 / 10;
        int remainder3 = num2 % 10;
        int num4 = num3 / 10;
        int remainder4 = num3 % 10;
        int num5 = num4 / 10;
        int remainder5 = num4 % 10;

        System.out.println(remainder1 + "" + remainder2 + "" + remainder3 + "" + remainder4 + "" + remainder5);
    }
}
