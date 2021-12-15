package Array;

import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {

        int [] numbers = {4,3,5,6,7,8}; // goot to know when you know number before
        System.out.println(numbers[3]);

       // numbers [6] = 66; // index out of boud exception

        System.out.println(numbers[1]);
        numbers [1] = 88;
        System.out.println(numbers[1]);
        System.out.println(numbers.length);                     // lenght of array

        System.out.println(Arrays.toString(numbers));

        for (int m = 0 ; m< numbers.length; m++ ){
            System.out.println(numbers[m]);
        }
    }
}
