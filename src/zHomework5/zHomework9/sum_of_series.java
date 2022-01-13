package zHomework5.zHomework9;

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

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int y =1;
        int sum = 0;
        for(int i=1 ;i <= number; i++ ){
            sum = sum+y;     // 0 = 0 +
            y = (y*10) +1;   // 1 = (1*10) +1;

        }
// o =
        System.out.println(sum);
    }
}

