package zProject5;
import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Scanner;

public class task6_print_uniqu_letters {
    public static void main(String[] args) {
        //Using the scanner ask the user to enter one string value and print only
        //unique letters combined as String also without any space in the
        //beginning and at the end.
        //Example -1 :
        //Given Value: "i am happy"
        //Output: "i am hpy"
        //** task 6 for loop ,i char meth, inside the string


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one string value");
        String str = input.nextLine().trim();
        String update = "";
        for (int a = 0; a < str.length(); a++) { // we will check every letter from the string

            if (update.indexOf(str.charAt(a)) == -1 || str.charAt(a) == ' ') {

                // if it does not find matching char/char sequence
                // it will return -1 ( false )
                // added charAt (space ) because we have to keep spaces in new string

                update = update + str.charAt(a);// so if its does not find same char we will add char to
                //string update
            }

        }
        System.out.println(update); // we print after the block


    }
}