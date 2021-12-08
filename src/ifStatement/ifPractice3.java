package ifStatement;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ifPractice3 {
    public static void main(String[] args) {
        //ask user to enter a single word
        //if word first letter is "M" there is a day starts with M --Monday
        //if there is T-----Tuesday , Thursday
        // if there is W  -- Wednesday
        // F Friday
        // Sunday or Sunday
        // if none of the day above --> inform the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine().toUpperCase();


        if ( word.startsWith("M") ){
            System.out.println("Monday");
        }
        if ( word.startsWith("T") ){
            System.out.println("Tuesday, Thursday");
        }
        if ( word.startsWith("W")  ){
            System.out.println("Wednesday");
        }
        if ( word.startsWith("F")  ){
            System.out.println("Friday");
        }
        if (word.charAt(0)  =='S'){
            System.out.println("Saturday, Sunday");
        }

        if (!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W") && !word.startsWith("F") &&
                !word.startsWith("S")){
            System.out.println("There is no day");
        }
    }
}
