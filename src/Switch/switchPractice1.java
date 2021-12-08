package Switch;

import java.util.Scanner;

public class switchPractice1 {
    public static void main(String[] args) {

        // get a number between 1-4 from user and print out
        // name of a season as
        // 1-> winter
        //...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 - 4");
        int num = scanner.nextInt();

        switch (num) {

            case 1:
                System.out.println("Winter");
                break;

            case 2:
                System.out.println("Spring");
                break;

            case 3:
                System.out.println("Summer");
                break;

            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Sorry, no this season :)");
                break;

        }
    }
}
