package String;

import java.util.Scanner;

public class practiceChar {

    public static void main(String[] args) {

        String device = "microphone";
        char ch = device.charAt(0);
        System.out.println(ch);
        char ch1 = device.charAt(4);
        System.out.println(ch1);
        System.out.println(device.charAt(9));
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");

        String word = input.next();
        System.out.println("This is your first letter of the string >> " + word.charAt(0));

        System.out.println("Please enter another word");
        // without storing incoming  string value,taking a letter from it and print
        System.out.println(input.next().charAt(0));


    }
}
