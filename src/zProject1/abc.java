package zProject1;

import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        //use scanner to
        // get name and DOB year of  user
        // calculate user's age
        //print "Your are <age> years old
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = input.nextLine();
        System.out.println(" Your name is " + name);
        System.out.println("Please enter your birth year ");
        int birth = input.nextInt();
        int age = 2021 - birth;
        System.out.println("So you are " + age + " years old.");



    }
}
