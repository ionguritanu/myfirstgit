package zHomework5;

import java.util.Scanner;

public class task5ThreeWords2 {
    public static void main(String[] args) {

        //Using Scanner ask user to enter one string value with three words
        // 1- Print first letter of each word together
        // 2- Print last letter of each word together
        // 3- Print length of each word (First print first word's length
        // then print second word's length lastly print last word's length)
        // Example: Please enter value: "Java String Test" Output: JST agt 4 6 4

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter string with three words");

        String value1 = input.next();
        String value2 = input.next();
        String value3 = input.next();

        System.out.println(value1.charAt(0) + "" + value2.charAt(0) + "" + value3.charAt(0));
        System.out.println(value1.charAt(value1.length()-1)+ ""+ value2.charAt(value2.length()-1) +""+ value3.charAt(value3.length()-1));

        System.out.println(value1.length());
        System.out.println(value2.length());
        System.out.println(value3.length());



// char abc1 = text.charAt(0) ;
// System.out.println(abc1);
// char abc2 = text.charAt(5) ;
// System.out.println(abc2);
// char abc3 = text.charAt(12) ;
// System.out.println(abc3);



// text = text.substring(0);
// System.out.println(text);


//System.out.println(text.substring(4,7) + "" );


    }
}

