package Java_Coding_Interview_questions;

import java.util.Arrays;

public class No1__swap_2_numbers {
    public static void main(String[] args) {

                                       //task 1.a  swap numbers
//        Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a
//        temporary variable?

        int a = 5;
        int b = 10;

        a= a+b;   // 5 + 10 = 15
        b = a-b;  // 15 - 10 = 5
        a = a-b;  // 15 - 5 = 10
        System.out.println(a);
        System.out.println(b);


        System.out.println("============");

                                         //task 1.b swap words


        String x = "Hello";
        String y = "Techtorial";
        x = x + y; // HelloTechtorial

        y = x.substring(0,x.length()-y.length());
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);

        System.out.println("=============");
                                          // task 2

    //2. Write a java program to find the second largest number in the array? Maximum and
    //minimum number in the array?

        int [] numArray = {3, 78, 56, 100, 5, 2};
        Arrays.sort(numArray);
        System.out.println(numArray[numArray.length-2]);


    }

}
