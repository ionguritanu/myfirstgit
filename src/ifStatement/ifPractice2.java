package ifStatement;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        // assuming that user using military style time 1-24
        // printout good morning / good afternoon
        // for the hours of morning or afternoon
        System.out.println("Please enter the time 1 - 24");

        Scanner input = new Scanner(System.in);
         int num = (int)input.nextDouble();


        if (num >= 00 && num < 12){
            System.out.println("Good morning");
        }
        if (num >= 12 && num < 18){
            System.out.println("Good afternoon");
            }
        if (num > 18 && num < 24){
            System.out.println("Good evening");
        }
        if (num <0 || num > 24){
            System.out.println("Check your time");
        }
    }
}
