package u_practiceAtHome;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class loopPractice3 {
    public static void main(String[] args) {
//        Two numbers are entered through the keyboard.
//        Write a program to find the value of one number raised
//        to the power of another.
//        (Do not use Java built-in method)

       Scanner input = new Scanner(System.in);
        System.out.println("First number");
        int first = input.nextInt();
        System.out.println("Second number");
        int second = input.nextInt();
        int result= 1;
        for (int a = 1; a<= second; a++){
            result*=first;

        }System.out.println(result);
    }
}
