package zHomework10;

import java.util.Scanner;

public class highest_common_factor {
    public static void main(String[] args) {
        //Write a java program to find HCF (Highest Common Factor) of two numbers.
        // Test Data : Input 1: 24 Input 2: 28 Expected Output : 4 -> Because HCF of 24 and 28 is 4
        // Input 1: 75 Input 2: 45 Expected Output : 15 -> Because HCF of 75 and 45 is 15
        //NOTE : Highest Common Factor means biggest common divident of two number.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        System.out.println("Please enter another number");
        int num2 = input.nextInt();
        int result = 1;
        for (int a = 1; a <= num1 && a <= num2; a++) {
            if (num1 % a == 0 && num2 % a == 0)
                result = a;

            }  System.out.println(result);

         }

    }
