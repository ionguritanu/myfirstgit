package u_practiceAtHome;

import java.util.Scanner;

public class loopPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number = input.nextInt();

        for(int a = 0; a<=10; a++){
            int multiplication = number * a;
            System.out.println(number +  "*" + a + " ="+ multiplication);

        }



      // task wits sum
         int sum = 0;
         for(int a = 1; a<= 10; a++) {
         sum+=a;
       } System.out.println("Sum is " + sum );


         //task finding factorial number
         int factorial = 1;
     for(int a = 1; a<= number; a++){
         factorial*=a;
     }
        System.out.println(factorial);



        }

    }
