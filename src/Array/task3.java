package Array;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        int[] arr = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        // print out numbers grater than 10

int [] largeNumbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
            }
            largeNumbers[i] = arr[i];
            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(largeNumbers));
        Arrays.sort(largeNumbers);
        System.out.println(Arrays.toString(largeNumbers));

    }

}