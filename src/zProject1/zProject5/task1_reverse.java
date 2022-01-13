package zProject1.zProject5;

import java.util.Scanner;

public class task1_reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String value = input.nextLine().trim();
        String reverse = "";

        for (int a = value.length()- 1; a >= 0; a--) {

            reverse += value.charAt(a);

        }
        System.out.println(reverse);

    }
}