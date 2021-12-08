package UdemyPractice;

import java.util.Scanner;

public class threeWordsSepareted {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter string with three words");

// This string has three words
// I need to find every word individually
// java script coding
// spaces
// If i need to work just specific part of the string
// substring
// If I start from beginning and continue till the
// index of space it will give me the first word.
// substring(begin, ending)
// "java l"
// substring(0,3); -> jav
        String threeWords = scanner.nextLine();
// java script coding
// fist index always included but second index is not included
        int indexOfSpace = threeWords.indexOf(" ");
// returns the index of character we provided in method.
// charAt method returns the character of the index you provided,
        String firstWord = threeWords.substring(0, indexOfSpace);

        // Removing the first word..
        String lastTwoWords = threeWords.substring(indexOfSpace + 1);
// script coding

        int secondIOS = lastTwoWords.indexOf(" ");
        String secondWord = lastTwoWords.substring(0, secondIOS);

        String thirdWord = lastTwoWords.substring(secondIOS + 1);
        System.out.println("" + firstWord.charAt(0) + secondWord.charAt(0)
                + thirdWord.charAt(0));

        System.out.println("" + firstWord.charAt(firstWord.length() - 1)
                + secondWord.charAt(secondWord.length() - 1) +
                thirdWord.charAt(thirdWord.length() - 1));
        System.out.println(firstWord.length());
        System.out.println(secondWord.length());
        System.out.println(thirdWord.length());
    }
}