package Array;

import java.sql.Array;
import java.util.Arrays;

public class BiggestNumber1 {
    public static void main(String[] args) {
        int[] nums = {4, 24, 10, 100, 5, 78, 11, 25, 55};
        // find the bigest number

       int greatestNum = nums [0];

       for (int a =0; a<nums.length; a++){

           if(nums[a] > greatestNum){

               greatestNum = nums[a];
           }
       }
        System.out.println(greatestNum);

        System.out.println("=================");

        //print out the all nums in string
        // print out the biggest num in array
        //sout the lowest num in array


        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length-1]);
        System.out.println(nums[0]);


    }
}
