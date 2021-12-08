package UdemyPractice;

public class taskHomePrintingLetters {
    //import java.util.Scanner;

    public static void main(String[] args) {
        System.out.println("Please enter three string values");
        // String num1 = "We";
        // String num2 = "Love";
        // String num3 = "Java";

        String num1 = "We";
        String num2 = "Love";
        String num3 = "Java";

        System.out.println(num1.charAt(0) + "" + num2.charAt(0) + num3.charAt(0));

        System.out.println(num1.charAt(num1.length() - 1) + "" + num2.charAt(num2.length() - 1) + num3.charAt(num3.length() - 1));

        boolean ldg = num1.equals(num2) && num2.equals(num3) ;
        System.out.println(ldg);
    }
}