package zProject1.zProject5;

import java.util.Scanner;

public class task4_half_tree_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 10");

        int number = input.nextInt();  // numbre from the user
        int layersOfThePyramid = 1;   //number that our pyramid will start from

        for (int a = 1; a <= number; a++){
            for (int b = 1; b <= a; b++){
                System.out.print(layersOfThePyramid + " ");
            }
            ++layersOfThePyramid;

            System.out.println(); // this sout is to start new line in our coding

        }

    }
}
