package zHomework5.zHomework6;

import java.util.Scanner;

public class task4_string_length {
    public static void main(String[] args) {
//        Using scanner ask user to enter one String value.
//        If string length is bigger than or equals to 3 print the string without first and last char.
//        If the length is smaller than 3 print print as it is.
//        (For this task you need to use if statement).
//        Example 1: Please enter the String value: test The output is: es
//        Example 2: Please enter the String value: Hello The output is: ell



            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a string value");

            String value = input.next();

            if (value.length() >= 3) {
                System.out.println(value.substring(1, value.length() - 1));
            } else {
                System.out.println(value);
            }


        }
    }


