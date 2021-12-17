package zProject5;

import java.util.Scanner;

public class task3_prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        boolean value = true;
        for (int b = 2; b <= number/2 ; b++){  // creating for loop to compare if increased  #
             if (number % b == 0){             // reassigning the value
                 value = false;
                 break;
            }

       }
        if (value)   // true
        System.out.println(number + " it is Prime Number ");
        else         // false
            System.out.println(number + " it's Not Prime Number");
        }

    }
