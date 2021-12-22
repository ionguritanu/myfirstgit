package u_practiceAtHome;

import java.util.Scanner;

public class loopPractice4 {
    public static void main(String[] args) {
        //Write a program that prompts the user to input
        // an integer and then outputs the number with the digits
        // reversed.
        // For example, if the input is 12345,
        // the output should be 54321.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int reverse = 0;

        int temp= number;
        int remainder = 0;

        while (temp>0){
            remainder= temp%10;
            reverse = reverse * 10 + remainder;
            temp/=10;
        }
        System.out.println("Revers of "+ number + " is " + reverse);
        System.out.println(remainder);

    }
}
// http://www.beginwithjava.com/java/loops/questions.html
//task 7 to do