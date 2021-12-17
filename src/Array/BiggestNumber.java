package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4, 24, 10, 100, 5, 78, 11, 25, 55};

        // find the largest numbe
        //int max = arr[0];

        int  biggest = nums[0]; // creating another int and pretending that [0] index is the biggest#
        for (int k = 1; k < nums.length; k++) {

            if ( nums[k] > biggest) {  //compare it with our [0] #

                biggest = nums[k];  //reasigne
            }
        }
        System.out.println(biggest);  //print out the biggest num

        System.out.println("================");

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]); //largest num in array
        System.out.println(nums[0]);             // smallest num

    }

}
