package Primitives;

import com.sun.security.jgss.GSSUtil;

public class ArithmeticPractice {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        System.out.println("Total is: " + (num1+num2));
        int sum = num1 +num2;
        System.out.println(sum);

        int sum2 = num1 + num2;

        // subtraction -->>
        int difference;
        difference = 10 - num2;
        System.out.println("difference is =" + difference);

        //multiplication -->*

        double product = difference * num2;
        System.out.println(product);

        //division--> /
        double division = product / 3;
        System.out.println(division);

        product = product * division;
        System.out.println(product);

        int division2 = 5/2; //2+2+1
        System.out.println(division2);

        float division3 = 5/2f;
        System.out.println(division3);

        float division5 = num2/num1;

        // remainder -=-> leftover--> %(modules)

        int a = 11;
        int b =5;
        int remainder1 = a % b;
        System.out.println("The left over of 11/5 is = "+remainder1);

        int x = 13;
        int y = 5;

        int remainder2 = x % y;
        System.out.println(remainder2);

        System.out.println(25%21);
        System.out.println(25 % x);

        int result = a +b * x - y / a * b + x % 2;
        System.out.println(result);

        

        //casting
    }
}
