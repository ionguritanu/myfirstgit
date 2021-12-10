package zHomework7;

import java.util.Scanner;

public class task4_without_x {
    public static void main(String[] args) {
        //Given a string, if one or both of the first 2 chars is 'x',
        // print the string without those 'x' chars,
        // and otherwise print the string unchanged.
        // Examples:
        //"xHi" → "Hi" "Hxi" → "Hi" "Tesxt" → "Testxt"

        System.out.println("Enter a string value");


        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);
        char letter = 'x';

        String newWord = word.charAt(0) + word.substring(2);
        if (ch1 == 'x' && ch2 == 'x'){
            System.out.println(word.substring(2,word.length()));
        }
        else if (ch1 == 'x'){
            System.out.println(word.substring(1,(word.length())));
        }
        else if (ch2 == 'x'){
            System.out.println(newWord);
        }
        else {
            System.out.println(word);
        }

    }
}
