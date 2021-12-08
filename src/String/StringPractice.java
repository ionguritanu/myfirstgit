package String;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //we will ask user their first name
        //we will ask user to their last name
        //we will print firstNName in lower case
        //last name in upper case in same line


        //.loLowerCase(); == makes the all letters lower case
        // .toUpperCase(); == makes the all letter upper case

        String str = "ion";
        str.toUpperCase();
        //If you don't reasign the string it will not change its value
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println("Please enter your first name ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name ");
        String lastName = scanner.nextLine();
        System.out.println(firstName.toLowerCase() +" "+ lastName.toUpperCase()) ;

        // when you use nextLine() we can enter multiple words
        // when we use next it will use only one word



    }
}
