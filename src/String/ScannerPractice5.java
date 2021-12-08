package String;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {
         /* we will ask user to enter a char letter
            if user enter char that is not an English letter
            code should print false
            is user enter English letter code should print true
          */


         /* ASCII table
            The table that all chars has a unique value
            If the value of the char between char a nad z it means this char is  a letter
          */
        System.out.println("Please enter a char letter ");
        char ch = 'a';
        boolean isLetter = ch>= 'a' && ch <= 'z';
        System.out.println(isLetter);




    }
}
