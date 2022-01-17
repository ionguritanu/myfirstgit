package ifStatement;

import java.util.Scanner;

public class elseTask1 {
    public static void main(String[] args) {
//        //    when your order total is more than $1000 you get %20 discount,
        //    otherwise you get %5 discount
        //    calculate and print total discount and payment in each case

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your total");
//        int total = scanner.nextInt();

        double total = 1;
        if (total >= 1000) {
            System.out.println("You will get discount " + total * 0.20);
            System.out.println("Your payment after 20% discount is" + (total - (total * 0.2)));
        } else {
            System.out.println("Your total discount is " + total * .05);
            System.out.println("Your pmt after 5% discount is " + (total - (total * 0.05)));
        }


        System.out.println("======Recap=====");
        double totalSpent = 1045;
        if(totalSpent>100){
            System.out.println("You'll get discount of "+ totalSpent *0.20 );
            System.out.println("Your total after spending is "+( totalSpent - (totalSpent*0.20)));
        }else{
            System.out.println("You'll get discount of "+ totalSpent * .05 );
            System.out.println("Your total after spending is : "+ (totalSpent-(totalSpent*0.05)));
        }
    }
}