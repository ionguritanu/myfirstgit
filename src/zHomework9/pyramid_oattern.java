package zHomework9;

import java.util.Scanner;

public class pyramid_oattern {
    public static void main(String[] args) {

        //Write a program in Java to make such a pattern like a pyramid with numbers increased by 1.
        // For this task ask the user to enter a number of the line.
        //Example: Please enter line number: 4 Expected output: 1 2 3 4 5 6 7 8 9 10
        //Please enter line number: 3 Expected output: 1 2 3 4 5 6

       Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int imputNumber = input.nextInt();
        int i = 1;

        for (int a = 1; a <= imputNumber; a++){

            for (int b =1; b <= i; b++){
                System.out.println(i+ " ");
                ++i;

            }
        }
       // System.out.println();





    }
}
