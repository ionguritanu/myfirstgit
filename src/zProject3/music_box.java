package zProject3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class music_box {
    public static void main(String[] args) {
        System.out.println("Available music types are Classical, Pop, and Country");
        Scanner input = new Scanner(System.in);
        System.out.println("What type of music do you want to listen?");
        String type = input.nextLine().toLowerCase();


        switch (type) {
            case "classical":
                System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The Planets");
                System.out.println("Witch song do you want to listen?");
                Scanner input1 = new Scanner(System.in);
                String song1 = input1.nextLine().toLowerCase();
                switch (song1) {
                    case "four Season":
                        break;
                    case "fur elise":
                        break;
                    case "finlandia":
                        break;
                    case "vocalisa":
                        break;
                    case "the planets":
                        break;
                    default:
                        System.out.println(song1 + " is not available");

                }
                if (song1.equals("four season") || song1.equals("fur elise") || song1.equals("finlandia") ||
                        song1.equals("vocalisa") || song1.equals("the planets")) {
                    System.out.println("Here is the price list:\n" +
                            "Classical : 2$\n" +
                            "Country: 3$\n" +
                            "Pop : 4$");
                    System.out.println("Please enter 2$ for this song");
                }
                int price1 = input1.nextInt();
                if (price1 == 2) {
                    System.out.println(song1 + " is playing. Enjoy the song!");
                } else if (price1 < 2) {
                    System.out.println(price1 + "$ is not enough. Please try later.");
                } else {
                    System.out.println("You have entered " + (price1 - 2) + " dollar more. Please wait for change." + song1 + " is playing. Enjoy with the song!");
                }
                break;


            case "pop":
                System.out.println("Bad guy, Talk, Please Me, 7 Ring, Without Me");
                System.out.println("Witch song do you want to listen?");
                Scanner input2 = new Scanner(System.in);
                String song2 = input2.nextLine().toLowerCase();
                switch (song2) {
                    case "bad guy":
                        break;
                    case "talk":
                        break;
                    case "please me":
                        break;
                    case "7 ring":
                        break;
                    case "without me":
                        break;
                    default:
                        System.out.println(song2 + " is not available");

                }
                if (song2.equals("bad guy") || song2.equals("talk") || song2.equals("please me") ||
                        song2.equals("7 ring") || song2.equals("without me")) {
                    System.out.println("Here is the price list:\n" +
                            "Classical : 2$\n" +
                            "Country: 3$\n" +
                            "Pop : 4$");
                    System.out.println("Please enter 4$ for this song");
                }
                int price2 = input2.nextInt();
                if (price2 == 4) {
                    System.out.println(song2 + " is playing. Enjoy the song!");
                } else if (price2 < 4) {
                    System.out.println(price2 + "$ is not enough,please try later.");
                } else {
                    System.out.println("You have entered " + (price2 - 4) + " dollar more. Please wait for change." + song2 + " is playing. Enjoy with the song!");
                }
                break;


            case "country":
                System.out.println("Meant to Be, Heaven, Simple, One Number Away, Get Along ");
                System.out.println("Witch song do you want to listen?");
                Scanner input3 = new Scanner(System.in);
                String song3 = input3.nextLine().toLowerCase();
                switch (song3) {
                    case "meant to be":
                        break;
                    case "heaven":
                        break;
                    case "simple":
                        break;
                    case "one number away":
                        break;
                    case "get along":
                        break;
                    default:
                        System.out.println(song3 + " is not available");

                }
                if (song3.equals("meant to be") || song3.equals("heaven") || song3.equals("simple") ||
                        song3.equals("one number away") || song3.equals("get along")) {
                    System.out.println("Here is the price list:\n" +
                            "Classical : 2$\n" +
                            "Country: 3$\n" +
                            "Pop : 4$");
                    System.out.println("Please enter 4$ for this song");
                }
                int price3 = input3.nextInt();
                if (price3 == 4) {
                    System.out.println(song3 + " is playing. Enjoy the song!");
                } else if (price3 < 4) {
                    System.out.println(price3 + "$ is not enough,please try later.");
                } else {
                    System.out.println("You have entered " + (price3 - 4) + " dollar more. Please wait for change." + song3 + " is playing. Enjoy with the song!");
                }
                break;
            default:
                System.out.println( "The " + type + " music category is not available.");
                break;


        }
    }
}


