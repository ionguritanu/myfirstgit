package Switch;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        /*
        1- IT department
           David, Tima
        2- Admin
           Alex, Jessi
        3- Customer Core
            Zack, Ana, John
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number for department");
        //String department = input.nextLine();
        int department = scanner.nextInt();

        switch (department){
                case 1:
                    System.out.println("You are in IT department who do you want to speak with");
                    scanner = new Scanner(System.in);
                    String name = scanner.nextLine().toLowerCase();
                    switch (name){
                        case "david":
                            int hour = LocalDateTime.now().getHour();         ////////////////////////
                            System.out.println(hour);
                            if (hour > 8 && hour < 12){
                                System.out.println("I am not available");
                            }else if (hour > 12 && hour < 17) {

                            } else{
                                System.out.println("I'm not available");       ///////////////////
                            }

                            System.out.println("Hello, this is David");
                            break;
                        case "tima":
                            System.out.println("Hello, this is Tima");
                            break;
                        default:
                            System.out.println("We do not have " + name);
                            break;
                    }break; // case1
            case 2:
                System.out.println("You are in Admin department who do you want to speak with");
                scanner = new Scanner(System.in);
                String name1 = scanner.nextLine().toLowerCase();
                switch (name1){
                    case "alex":
                        System.out.println("Hello, this is Alex");
                        break;
                    case "jessy":
                        System.out.println("Hello, this is Jessy");
                        break;
                    default:
                        System.out.println("We do not have " + name1);
                        break;
                }break;
            case 3:
                System.out.println("You are in Customer Care department who do you want to speak with");
                scanner = new Scanner(System.in);
                String name2 = scanner.nextLine().toLowerCase();
                switch (name2){
                    case "zack":
                        System.out.println("Hello, this is Zack");
                        break;
                    case "anna":
                        System.out.println("Hello, this is Anna");
                        break;
                    case "john":
                        System.out.println("Hello, this is John");
                        break;
                    default:
                        System.out.println("We do not have " + name2);
                        break;
                }break;
            default:
                System.out.println("Your selection is not valid for IT Department");
            break;

        }
    }
}
