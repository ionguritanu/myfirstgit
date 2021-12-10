package zProject2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your balance");
        double total = input.nextDouble();
        double result = total * 100;
        int result1 = (int) result;
        int quarters = result1 / 25;
        int reminder1 = result1 % 25;
        int dimes = reminder1 / 10;
        int reminder2 = reminder1 % 10;
        int nickles = reminder2 / 5;
        int reminder3 = reminder2 % 5;
        int pennies = reminder3 / 1;
        System.out.println(total + " will make " + quarters + " quarters " + dimes + " dimes " + nickles +
                " nickles " + pennies + " pennies");
    }
}