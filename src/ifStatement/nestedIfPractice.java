package ifStatement;

import java.util.Scanner;

public class nestedIfPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //passport
        //visa
        //ticket
        System.out.println("Do you have passport? yes/not");
        String passport = scanner.nextLine();

        if(passport.equalsIgnoreCase("yes")){

            System.out.println("Do you have visa? yes/no");

            if (scanner.nextLine().equalsIgnoreCase("Yes")){

                System.out.println("Do you have ticket? yes/no");

                if (scanner.nextLine().equalsIgnoreCase("Yes")){

                    System.out.println("Enjoy your flight");
                } else {
                    System.out.println("Please get a ticket");
                }

            }else{
                System.out.println("You need to get visa");
            }
        } else {

            System.out.println("PLease get the passport ");
        }

    }
}
