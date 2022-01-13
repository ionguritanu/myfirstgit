package zHomework5.zHomework9;

import java.util.Scanner;

public class pyramid_oattern {
    public static void main(String[] args) {

        //Write a program in Java to make such a pattern like a pyramid with numbers increased by 1.
        // For this task ask the user to enter a number of the line.
        //Example: Please enter line number: 4 Expected output: 1 2 3 4 5 6 7 8 9 10
        //Please enter line number: 3 Expected output: 1 2 3 4 5 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int line = sc.nextInt();
        // 2
        // Loop has to run same time with number of line
        int numbersOfThePyramid = 1;    // the pyramid will start from '1'

        for (int i = 1; i <= line; i++) {               //creating for loop to increase numbers
            // Now number of line and i is mathching

            // i represents the line number i am in
            // This loop has to run i time
            for (int j = 1; j <= i; j++) {
                // When I am printing on this line should I print on everything same line?
                // If I know this the last number i am printing in the line
                // I should remove the space
                if (j == i) {
                    System.out.print(numbersOfThePyramid++ );
                } else {
                    System.out.print(numbersOfThePyramid++ + " ");
                }
            }
            System.out.println();
        }

    }

}






