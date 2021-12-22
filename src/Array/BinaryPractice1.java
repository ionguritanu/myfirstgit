package Array;

import java.util.Arrays;

public class BinaryPractice1 {
    public static void main(String[] args) {

        // first have to declare and sort it

        int[] numbers = {4,6,10,23,1,12};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //[1, 4, 6, 10, 12, 23]

        System.out.println(Arrays.binarySearch(numbers, 23));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 50));
        System.out.println(Arrays.binarySearch(numbers, -454));



    }
}
