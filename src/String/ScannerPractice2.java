package String;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        // BMI calculation BMI = weight(kg) / (height * height(meters))
        //18 - 24
        // "Your BMI is <BMI>"

        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter your weight in kg? ");
        double weight = input.nextDouble();
        System.out.println("Please enter your height in meters ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is " +BMI);




    }
}
