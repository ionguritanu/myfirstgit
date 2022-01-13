package zProject1.zProject3;

import java.util.Scanner;

public class musicbox_uld {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String listOfmusic = "Available music types are: ";
            int price = 0;


            System.out.println("What kind of music would you like to listen:\n- Classical\n- Pop\n- Country");
            String listOfClassical = "\n- Four Seasons\n- Fur Elise\n- Finlandia\n- Vocalise" +
                    "\n- The Planets\nWhich one do you want to listen?";
            String listOfPop = "\n- Bad guy\n- Talk\n- Bad guy\n- Seven ring" +
                    "\n- Without Me\nWhich one do you want to listen?";
            String listOfCountry = "\n- Meant to Be\n -Heaven\n -Simple\n -One number away\n -Get Along " +
                    "\n Which one do you want to listen?";
            String userChoice = input.nextLine().toLowerCase();
            if (userChoice.equals("classical")) {
                listOfmusic += listOfClassical;
                price = 2;
            } else if (userChoice.equals("pop")) {
                listOfmusic += listOfPop;
                price = 4;
            } else if (userChoice.equals("country")) {
                listOfmusic += listOfCountry;
                price = 3;
            } else {
                System.out.println(userChoice + " is not available.");
                System.exit(1);
            }
            System.out.println(listOfmusic);
            String songName = input.nextLine().toLowerCase();
            if (!listOfmusic.toLowerCase().contains(songName)) {
                System.out.println("There is no song with name " + songName + " in our list.");
                System.exit(1);
            }
            System.out.println("Please enter the " + price + "$ for this music");
            input = new Scanner(System.in);
            int money = input.nextInt();
            if (price == money) {
                System.out.println(songName + " is playing. Enjoy with the music");
            } else if (price > money) {
                System.out.println(money + " is not enough. Please try later.");
            } else if (price < money) {
                System.out.println("Here is your " + (money - price) + "$ dollar change."
                        + songName + "is playing. Enjoy the music");
            }


        }
    }
