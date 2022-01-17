package ifStatement;

import java.util.Scanner;

public class elseTask2 {
    public static void main(String[] args) {
        //find out if your zipcode is even number or odd num

        Scanner input = new Scanner(System.in);
        System.out.println("What is your zipcode");
        int zipcode = input.nextInt();

        if (zipcode % 2 ==0){
            System.out.println("your zipcode is even number");
        }else {
            System.out.println("your zipcode is odd number");
        }


        System.out.println("=====RECAP=====");

        Scanner next = new Scanner(System.in);
        System.out.println("Please enter your zipcode");
        int newZipCode = next.nextInt();
        if(newZipCode %2 ==0){
            System.out.println("The zipcode you entered "+ newZipCode+ " is add number");
        }else{
            System.out.println("The zipcode you have entered "+ newZipCode+ " is not add number");
        }




    }
}
