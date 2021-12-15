package zHomework9;

import java.util.Scanner;

public class sum_of_series {
    public static void main(String[] args) {

//  Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
//  Here the number n will come from user so if user gives number 3 you should find sum of 1 + 11 + 111.
//  Please look carefully example below.
//Test Data : Input the number of terms : 5 Expected Output : 12345
// (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = in.nextInt();
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                p *= j;
            }
            sum += p;
        }
        System.out.println( sum);
    }
    }

