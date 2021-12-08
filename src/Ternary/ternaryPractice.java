package Ternary;

import java.util.Locale;

public class ternaryPractice {
    public static void main(String[] args) {

        int a = 2, b = 3;
        // ?  :

       String result1 =  a < b ? "Hello" : "Bye";

       // String result2 = a < b ? a * b  : "text" ;  to be able to store the result ternary both option
        //                                             should be same data
        System.out.println( a<b ? a * b : "Text");

        boolean result3 = a >= b ? a == b : a < b;
        System.out.println(result3);

       int result4 =  'a' > 'Z' ? 5+6+7 : 7-4-1;
        System.out.println(result4);

        String str = "David";
        String result5 = str.substring(3).equals("id") ? str.toLowerCase().concat(" is number") : str.toUpperCase().concat("is strng");
        System.out.println(result5);

        System.out.println(str.equalsIgnoreCase("DAVID") ? str.substring(3).toUpperCase()  : str.substring(3).toLowerCase());

       int num1 = 2;
       int num2 = 3;
       int result6 =  num1 % 2 == 0 ? 5 : 6;
       System.out.println(result6);


    }
}
