package Array;

import java.util.Arrays;

public class combiningArrays {
    public static void main(String[] args) {

        int [] nums1= {3,4,5};
        int [] nums2 = {6,7,8,9};

        //combine this two arrays

        int a = nums1.length;
        int b = nums2.length;
        int[] result = new int[a + b];

        for (int c = 0; c<nums1.length; c++){

            result[c] = nums1[c];

        }System.out.println(Arrays.toString(result));
        for (int d = nums1.length, e=0; b < result.length; b++, e++){
            result [d] = nums2[e] ;
        }
        System.out.println(Arrays.toString(result));
    }
}
