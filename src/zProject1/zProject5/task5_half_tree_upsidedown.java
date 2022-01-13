package zProject1.zProject5;

import java.util.Scanner;

public class task5_half_tree_upsidedown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 10");

        int number = input.nextInt();
        int layersOfPyramid = number;

        for (int a = number; a >= number; a--) {
            for (int b = 1; b <= a; b++) {
               System.out.print(layersOfPyramid + " ");

            }
            layersOfPyramid--;

           System.out.println(); // this sout is to start new line in our coding

        }

        System.out.print(layersOfPyramid++ );

        //System.out.println(); // this sout is to start new line in our coding

    }
}