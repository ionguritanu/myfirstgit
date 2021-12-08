package Switch;

import java.util.Locale;
import java.util.Scanner;

public class switchPractice3 {
    public static void main(String[] args) {
        // ask user for name of geometrical shape
        // based on the name of the shape calculate the area of that shape
        // get length and width for rectangular
        // and height and base  for triangle of those from user to use them in calculation
        // print the name of the shape and area of that shape
        // triangle, rectangular

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name of geometrical ");  //switch
        String shape = input.nextLine().toLowerCase();
        //System.out.println("Please enter length and width for rectangular or length and width for rectangular
        //                   and height and base  for triangle" );
//        int length = input.nextInt();
//        int width = input.nextInt();
//        int  base = input.nextInt();


        switch (shape) {

            case "rectangular":
                System.out.println("Please enter the height of triangle");
                double h = input.nextDouble();
                System.out.println("Please enter base of triangle");
                double b = input.nextDouble();
                System.out.println("The are of triangle = " + ((b*h)/2 ));
                break;


            case "triangle":
                System.out.println("Please enter legth of rectangular");
                double l = input.nextDouble();
                System.out.println("Please enter width");
                double w = input.nextDouble();
                System.out.println("T he area of triangle " + (l * w));
                break;

            default:
                System.out.println("Your shape selection does not match");
                break;
      }
   }
}
