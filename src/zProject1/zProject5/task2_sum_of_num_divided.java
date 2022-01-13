package zProject1.zProject5;

import java.util.Scanner;

public class task2_sum_of_num_divided {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int value1 = input.nextInt();
        System.out.println("Please enter a number greater than first number");
        int value2 = input.nextInt();
        int sum = 0;

        for ( ; value1 <= value2; value1++){

            if (value1 %2 ==0 && value1 %7 ==0){
                sum+= value1;
            }

        }
        System.out.println(sum);
    }
}
