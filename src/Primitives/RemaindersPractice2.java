package Primitives;

public class RemaindersPractice2 {
    public static void main(String[] args) {


        // find th e product of digits from given number
        //456=>4*5*6=120 sout("the product is =" <product>

        //456 %10 = 6;
        // 45 % 10 =5;
        // 4 % 10 = 4;

        int myNumber = 456;
        int digit3 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit2 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit1 = myNumber % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        int product = digit1 * digit2 * digit3;
        System.out.println("The product is =" + product);
    }
}
