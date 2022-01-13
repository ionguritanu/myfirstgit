package zHomework5.zHomework8;

import java.util.Scanner;

public class task2_loop_multiplication_table {
    public static void main(String[] args) {

        //Using Scanner ask user to provide any int number
        // and print multiplication table of given number
        // Please make sure your output exactly look like given example below.
        // EXAMPLE:
        //Input number: 5 Output : 5 1 = 5 5 2 = 10 5 3 = 15 5 4 = 20 5 5 = 25 5 6 = 30 5 7 = 35 5 8 = 40 5 9 = 45 5 10 = 50

        System.out.println("Please enter an integer number");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int a = 1;

        do{
            System.out.println(number + " * " + a + " = " + (number * a) );
            a++;
        }while(a<=10);


    }

}
