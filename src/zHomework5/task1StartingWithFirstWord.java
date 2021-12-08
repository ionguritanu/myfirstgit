package zHomework5;

import java.util.Scanner;

public class task1StartingWithFirstWord {
    public static void main(String[] args) {
       // Using scanner enter two String input. Print true if the second string is starting with the first string’s last two characters, otherwise print false. Example 1: Enter first string value: Google Enter second string value:: Learning Result: true Example 2: Enter first string value: Utility Enter Second string value: Type Result: true
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first string value");
        String firstv = input.nextLine();
        System.out.println("Enter second string value");
        String secondv = input.nextLine();

        int length=firstv.length();

        char first=firstv.charAt(length-2);

        first=Character.toUpperCase(first);

        char first1=firstv.charAt(length-1);

        char second=secondv.charAt(0);

        char second1 =secondv.charAt(1);
        boolean result = first==second&&first1==second1;
        System.out.println(result);



        //System.out.println(result);




        //  System.out.println(result1.equalsIgnoreCase(result2));



        //*System.out.println(word1.equalsIgnoreCase(word2));





//enter 2 strings
//print true if 2nd string is starting with     //first string 's last 2 characters
//otherwise print false'
    }
}

