package zHomework5;

import java.util.Scanner;

public class task4ThreeWords {
    public static void main(String[] args) {

        /* Please ask user to input three string value
        1- Print the first char of those three-string together.
        2- Print the last char of each string together
        3- Print true if each of the string lengths is equaled to each other.

        EXAMPLE: Input -1: We Input -2: Love Input -3: Java OUTPUT: WLJ eea false
        (since each string length is not equals to each other)*/



        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three string values");
        // String num1 = "We";
        // String num2 = "Love";
        // String num3 = "Java";
        String num1 = input.next();
        String num2 = input.next();
        String num3 = input.next();
        //1
        System.out.println(num1.charAt(0) + "" + num2.charAt(0) + num3.charAt(0)) ;
        //2
        System.out.println(
                num1.charAt(num1.length()-1) + "" + num2.charAt(num2.length()-1) +
                        num3.charAt(num3.length()-1));
        //3

        int length1 = num1.length();
        int length2 = num2.length();
        int length3 = num3.length();

        boolean result = length1 == length2 &&  length2  == length3 && length3 == length1 ;
        System.out.println(result);

//boolean result = num1.length() || num2.length() || num1.length();
//System.out.println(result);


// if (num1.equals(num2)){
//   System.out.println("true");
// }
// if (num2.equals(num3)){
//   System.out.println("true");
//   }
// if (num1.equals(num3)){
//   System.out.println("true");
// }
// System.out.println(num1.equals(num2));
// System.out.println(num2.equals(num3));
// System.out.println(num1.equals(num3));

        //boolean length = num1.equals(num2) && num2.equals(num3) ;
        //System.out.println(length);

        //boolean length1 = num1.equals(num2) || num2.equals(num3) || num1.equals(num3);
        //System.out.println(length1);


    }
}


