package Array;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // -ask user, how many names that s/he wants to store in array
        // -store those names by getting it from user in to array that is called 'names'
        // if the namme is 5 or more letters store it in 'longName' array
        // if the name is less than 5 store it in 'shortNmaes' array
        //  -print them out by using ->Arrays.toString(); method

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide how many names you want to store");
        int number = scanner.nextInt();
        //String [] names = new String [number];
        String [] shortNames = new String [number];
        String [] longNames = new String [number];
        scanner = new Scanner(System.in);


           for (int i =0; i<number; i++) {
            System.out.println("Enter" + (i + 1) + " name");
            String name = scanner.nextLine();
            if (name.length() >= 5){
                longNames[i] = name;
            }else{
                shortNames[i] = name;
            }
            System.out.println(Arrays.toString(longNames));
            System.out.println(Arrays.toString(shortNames));
        }
    }
}
