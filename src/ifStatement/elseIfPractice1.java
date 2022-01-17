package ifStatement;

import java.util.Scanner;

public class elseIfPractice1 {
    public static void main(String[] args) {
        /*
        get three test results from user and calculate the average of those tests
        based on the average score
        print out letter grade for this student
        average are - 100 to 90 --> your later grade A
        average are 89 to 80 ----B
        average 79 - 60 -------C
                   less than 60 --- "you should take the course again"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first score");
        int score1 = scanner.nextInt();
        System.out.println("Please enter a second score");
        int score2 = scanner.nextInt();
        System.out.println("Please enter a third score");
        int score3 = scanner.nextInt();

        int average = (score1+score2+score3)/3;

        if ( average <100 && average > 90 ){
            System.out.println("Your grade is A");
        } else if (average < 89 &&  average >80 ){
            System.out.println("Your grade is B");
        }else if (average <79 && average > 60){
            System.out.println("Your grade is C");
        }else{
            System.out.println("You should take the course again");
        }

                        //----------------RECAP
        /*
        get three test results from user and calculate the average of those tests
        based on the average score
        print out letter grade for this student
        average are - 100 to 90 --> your later grade A
        average are 89 to 80 ----B
        average 79 - 60 -------C
                   less than 60 --- "you should take the course again"
         */

//        Scanner scanner10 = new Scanner(System.in);
//        System.out.println("Please enter your first test result");
//        int result1 = scanner10.nextInt();
//        System.out.println("Please enter your second test result");
//        int result2 = scanner10.nextInt();
//        System.out.println("Please enter your third test result");
//        int result3 = scanner10.nextInt();
//
//        int average10 = result1+result2+result3;
//        if (average10 >90 && average10<=100){
//            System.out.println("Your grade is : A");
//        }else if(average10>80 && average10<=90){
//            System.out.println("Your grade is : B");
//        }else if (average10>60 && average10<=80){
//            System.out.println("Your grade is : C");
//        }else{
//            System.out.println("You need to study more");
//        }
    }
}
