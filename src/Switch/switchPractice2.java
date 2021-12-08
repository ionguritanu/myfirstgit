package Switch;

import java.util.Scanner;

public class switchPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you favorite fruit from: mango, kiwi, orange, apple, grape");
        String str = input.nextLine().toLowerCase();


        switch (str) {

            case "mango":
                System.out.println("We have your favorite fruit");
                break;

            case "kiwi":
                System.out.println("We have your favorite fruit");
                break;

            case "orange":
                System.out.println("We have your favorite fruit");
                break;

            case "apple":
                System.out.println("We have your favorite fruit");
                break;

            case "grape":
                System.out.println("We have your favorite fruit");
                break;

            default:
                System.out.println("Sorry, we don't have your favorite fruit");
                break;

        }
    }
}