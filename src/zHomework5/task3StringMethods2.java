package zHomework5;

import java.util.Scanner;

public class task3StringMethods2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //2

        //Go to Main class
        //Create a Scanner object inside the main method
        //Ask the user to enter a random word
        //Then ask the user to input the number of letters that word consists
        //Your code should print true if the user entered a right number of letters in the word, false if the wrong number is entered.
        //Then the code should ask to enter a letter that the user wants to find an index of.
        //Your code should print the index of the entered letter, if the word doesn’t contain the letter then the code should print -1
        //Please look at two Examples below to understand how your code should work.
        //Enter a random word
        //Techtorial -> this line represents user's input Enter number of letter that word consists 10 -> this line represents user's input true Enter a letter that you want to find an index a -> this line represents user's input 8
        //
        //Second Example
        //
        //Enter a random word Java Enter number of letter that word consists 6 false Enter a letter that you want to find an index v 2



// Please do all coding here

        System.out.println("Enter a random word");
        String word = input.nextLine(); //3

        System.out.println("Enter number of letter that word consists");
//System.out.println(word.length()); //4

        int letterCount = input.nextInt();   //5

        int word1 = word.length();

        boolean result = word1 == letterCount;

        System.out.println(result);



        System.out.println("Enter a letter that you want to find an index");
        String letter = input.next();

        System.out.println(word.indexOf(letter));






//System.out.println(word.indexOf(''));
// String abc = input.nextLine();
// int index;
// if (word.length() = abc.length();




    }
}


