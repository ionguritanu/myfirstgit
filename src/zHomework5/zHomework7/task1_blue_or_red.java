package zHomework5.zHomework7;

import java.util.Scanner;

public class task1_blue_or_red {
    public static void main(String[] args) {
        //Using the scanner ask the user to enter any String value.
        // If this String has a color like red or blue with lower case print the red or blue.
        // Other wise do not print anything.
        // EXAMPLE-1: Input: "xxredyy" Output: red
        // EXAMPLE-2: Input: "xbxltue" Output: blue

        System.out.println("Enter a string value");


        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.toLowerCase().contains("b") && input.toLowerCase().contains("l") && input.toLowerCase().contains("u") && input.toLowerCase().contains("e") || input.toLowerCase().contains("blue")){
            System.out.println("blue");

        }
        if (input.toLowerCase().contains("r") && input.toLowerCase().contains("e") && input.toLowerCase().contains("d") || input.toLowerCase().contains("red")){
            System.out.println("red");
        }
    }
}
