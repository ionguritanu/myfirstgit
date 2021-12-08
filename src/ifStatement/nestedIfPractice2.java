package ifStatement;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class nestedIfPractice2 {
    public static void main(String[] args) {
//        Ask the user
//        city --> Chicago
//        school  --> techtorial
//        batch -->  11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which city you are in");
        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("Chicago")){
            System.out.println("Which course you attending?");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("Techtorial")){
                System.out.println("Which batch are you in?");
                String batch = scanner.nextLine();
                if (batch.equalsIgnoreCase("11")){
                    System.out.println("It is getting easy");
                }else{
                    System.out.println("Congrats , you already done!");
                }
            }else{
                System.out.println("We are at Des Plaines");
            }

        } else{
            System.out.println("Please come to Chicago");
        }
    }


//    }
}
