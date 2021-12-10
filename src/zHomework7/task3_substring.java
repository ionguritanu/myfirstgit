package zHomework7;

import java.util.Scanner;

public class task3_substring {
    public static void main(String[] args) {
        //Using the scanner ask the user to enter one String value.
        // If the string length is bigger than or equals to 3 print the string without first and last char.
        // If the length is not bigger than 3 print as it is.
        // (for this task you need to use if statement).
        // Example 1: Please enter the String value: test The output is: es
        // Example 2: Please enter the String value: Hello The output is: ell

        System.out.println("Enter a string");

        Scanner input = new Scanner(System.in);

        String value = input.nextLine();

        if (value.length()>= 3){
            System.out.println(value.substring(1, value.length()-1));
        }else {
            System.out.println(value);

        }
    }
}

