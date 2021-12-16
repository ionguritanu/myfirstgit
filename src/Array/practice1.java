package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {

        int [] studentIds = new int[5];
        studentIds [0] = 21;
        studentIds [1] = 31;
        studentIds [2] = 41;
//        studentIds [3] = 51;
//        studentIds [4] = 61;
        System.out.println(studentIds);  // it will  print out the location in memory for the array
        System.out.println(studentIds[0]);
        System.out.println(studentIds[1]);
        System.out.println(studentIds[2]);
        System.out.println(studentIds[4]);

        studentIds[1] = 99;
        //System.out.println(studentIds[1]);

        //studentIds[5] = 51; // index
        //System.out.println(studentIds[5]);

        for (int i = 0; i < studentIds.length; i++){
            System.out.println(studentIds[i]);
        }
        System.out.println(Arrays.toString(studentIds)); // it will print out all elements from a






    }
}
