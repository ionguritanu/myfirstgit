package zHomework8;

import java.util.Scanner;

public class task4_replace_with_a {
    public static void main(String[] args) {
        // Using the scanner ask the user to provide String value.
        // Then replace all the char of the String with 'a' using loop
        // and PRINT IN EVERY STEP. Look at example below carefully
        // For example: Input: Success Output:
        // "auccess" "aaccess" “aaacess” "aaaaess" "aaaaass" "aaaaaas" "aaaaaaa" “aaaaaaa”

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value");
        String str = input.nextLine();

        int index = 1;
        String a = "a";
        while (index <= str.length()) {
            str = str.substring(index);
            str = a+str;
            index++;
            a +="a";
            System.out.println(str);
        }

    }
    }


//        String newvalue = value.substring();
//        System.out.println(newvalue);




//

////////////////////////////////////////////////////////

//        do  {
//            //String updateInput = value.replace(value.charAt(0),'a' );
//         String abc =   value.replace(value.charAt(0),'x');
//            System.out.println(abc);
//
//            ij++;
//
//        } while (i < length);
