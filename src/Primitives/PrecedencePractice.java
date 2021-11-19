package Primitives;

import java.util.function.DoubleToIntFunction;

public class PrecedencePractice {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int result = num1 + num2 * num2 + num1 / 3 -1;
        System.out.println(result);

        int count = 6/ 3 + 5 % 3 - ( 4 + 1 *(5 * 2 -1));
        System.out.println(count);
    }
}
