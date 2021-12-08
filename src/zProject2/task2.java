package zProject2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of quarters ");
        int quarters = input.nextInt();
        System.out.println("Please enter numbers of dimes");
        int dimes = input.nextInt();
        System.out.println("Please enter number of nickles");
        int nickles = input.nextInt();
        System.out.println("Please enter numbers of pennies");
        int pennies = input.nextInt();
        double total = (quarters* 0.25) + (dimes * 0.1) + (nickles* 0.05) + (pennies* 0.01);
        System.out.println("The total in dollar is " + total);
    }
}
