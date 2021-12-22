package Array;

import java.util.Arrays;

public class multiPractice {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);

        numbers[0][0] = 22;
        numbers[0][1] = 33;
        numbers[0][2] = 44;
        numbers[1][0] = 54;
        numbers[1][1] = 76;
        numbers[1][2] = 99;


        System.out.println(numbers[1][1]);  //76
        System.out.println(Arrays.deepToString(numbers)); //[[22, 33, 44], [54, 76, 99]]

        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(Arrays.toString(numbers[i]));// is printing elements one by one
            for (int k = 0; k < numbers[i].length; k++) {
                System.out.println(numbers[i][k]);

            }
            System.out.println("==================");

          }

        for (int[] nums : numbers) {
            for (int num : nums) {
                System.out.println(num);
            }

        }
    }
}