package ifStatement;

import java.util.Scanner;

public class ifPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7");
        double number = input.nextDouble();
        int num = (int)number;

        // get a num between 1 to 7 from user
        //print the name of the day for that given number from user


        if (num == 1){
            System.out.println("Monday");
        }
        if (num == 2){
            System.out.println("Tuesday");
        }
        if (num == 3){
            System.out.println("Wednesday");
        }
        if (num == 4){
            System.out.println("Thursday");
        }
        if (num == 5){
            System.out.println("Friday");
        }
        if (num == 6){
            System.out.println("Saturday");
        }
        if (num ==7){
            System.out.println("Sunday");
        }


        // if the user out of range number
        //  print your number is out of range

        if ( num > 7 || num < 1){
            System.out.println("out of range");
        }
    }
}
