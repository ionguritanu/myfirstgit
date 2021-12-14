package Loops.while_do_doWhile;

import java.util.Scanner;

public class makingStarTree {
    public static void main(String[] args) {
        //-Ask user to provide a number between 3 to 10
        //  - make a star tree for that many line
        //  (Use Do-While Loop to implement solution)
        //    ex: input --> 4
        //                  *
        //                  **
        //                  ***
        //                  ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");

        int number = scanner.nextInt();
        int x = 0;
        String str = "*";


        do{
            System.out.println(str);
            str+= "*";
            //if (number>= 3 && number<=10)
            x++;

        }while (x < number);

    }
}