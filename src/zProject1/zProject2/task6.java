package zProject1.zProject2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        //Using a scanner enter three different ingredients for the product on the
        //same line. Then ask the user to enter any int number. Change the first
        //letter of the ingredients starting from the entered number. (Ingredients
        //should start with different letters. Please read the example carefully )
        //Example 1:
        //Please enter three ingredients with spaces:
        //Milk Peanuts Butter
        //Please enter the int number:
        //5
        //The output is:
        //5ilk 6eanuts 7utter
        //Description

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three different ingredients on the same line");
        String threeWords = scanner.nextLine();           //user input

        System.out.println("Please enter a number");
        int number = scanner.nextInt();                  // user number input

        // separating  words
        int indexOfSpace = threeWords.indexOf(' ');
        String firstWord = threeWords.substring(0, indexOfSpace +1);  // removing the first word
        System.out.println(firstWord);


        int indexOfSpaceTwo = threeWords.indexOf(' ');
        String lastTwoWordsWithSpace = threeWords.substring(firstWord.lastIndexOf(' ')+1 );    // removing last two words

        String secondWord = lastTwoWordsWithSpace.substring(0, indexOfSpaceTwo +1);             // second word
        System.out.println(secondWord);

        String thirdWord = lastTwoWordsWithSpace.substring(lastTwoWordsWithSpace.lastIndexOf(' ') +1); // removing 3rd word
        System.out.println(thirdWord);

        /// cut the first letter from string(words)
        String firstWordLetter = firstWord.substring(1);               // first word without first letter
        System.out.println(firstWordLetter);

        String secondeWordLetter = secondWord.substring(1);             // second word without first letter
        System.out.println(secondeWordLetter);

        String thirdWordLetter = thirdWord.substring(1);                // third word without first letter
        System.out.println(thirdWordLetter);

        System.out.println(number + firstWordLetter + " " + (number+1) + secondeWordLetter + " " + ( number +2) + thirdWordLetter );

    }
}


