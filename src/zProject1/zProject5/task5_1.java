package zProject1.zProject5;

import java.util.Scanner;

public class task5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 10");

        int number = input.nextInt();
        //int layersOfPyramid = number;

        for (int a =number; a>=1; a--){
            for(int b =1; b <= a ; b++){
                System.out.print(a + " ");
            }
            System.out.println();

        }
    }
}

