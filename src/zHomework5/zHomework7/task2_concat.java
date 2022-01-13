package zHomework5.zHomework7;

import java.util.Scanner;

public class task2_concat {
    public static void main(String[] args) {
// Using the scanner ask the user to enter a String value and if both string length is same
// concatenatethem together then print the result.
// If both String length is not same then omit last chars from the longer string
// so it is the same length as the shorter string.
// After making both strings the same length then concatenate them and print the result.
// NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.
// !!!!!!!!!!!! EXAMPLE-1: String 1: "Cell" String 2: "Phone" Output: "CellPhon"
// EXAMPLE-2: String 1: "Cable" String 2: "Mic" Output: "CabMic"

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string 1");
        String word1 = input.next();

        System.out.println("Enter string 2");
        String word2 = input.next();

        //if are the same
        if (word1.length() == word2.length()) {
            System.out.println(word1.concat(word2));
        }

        else if (word1.length() > word2.length()) {
            System.out.println(word1.substring(0, word2.length()) + word2);
        }
        else if (word2.length() > word1.length()) {
            System.out.println(word1+word2.substring(0, word1.length()));
        }
    }
}
