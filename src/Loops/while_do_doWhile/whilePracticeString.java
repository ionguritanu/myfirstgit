package Loops.while_do_doWhile;

import java.util.Scanner;

public class whilePracticeString {
    public static void main(String[] args) {
        //get string from user
        //and print every letter from given string separated by comma

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.next();

//        int i = 0;
//        while (i < word.length()) {
//            System.out.print(word.charAt(i) + ", ");
//            i++;
//
//
//            System.out.println(" ");


            int x = 0;
            int l = (word.length()-1 );
            while (x <= l) {
                System.out.print(word.charAt(l) + ", ");
                l--;

            }
        }
    }

// count how many lowercase letters are in given string


