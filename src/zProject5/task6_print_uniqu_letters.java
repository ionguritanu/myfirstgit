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
        System.out.println("Please enter a string value ");
        String value = input.nextLine().trim();

        String s = "mmababctamantlslmag";
        int distinct = 0;

        for (int i = 0; i < value.length(); i++) {

            for (int j = 0; j < value.length(); j++) {

                if (value.charAt(i) == value.charAt(j)) {
                    distinct++;

                }
            }
            System.out.println(value.charAt(i) + "--" + distinct);
            String d = String.valueOf(value.charAt(i)).trim();
            value = value.replaceAll(d, "");
            distinct = 0;

        }

    }
}
//        char str[] = value.toCharArray();
//        int n = str.length;
//        // Used as index in the modified string
//        int index = 0;
//
//        // Traverse through all characters
//        for (int i = 0; i < index; i++) {
//
//            // Check if str[i] is present before it
//            int j;
//            for (j = 0; j < i; j++)
//            {
//                if (str[i] == str[j])
//                {
//                    break;
//                }
//            }
//
//            // If not present, then add it to
//            // result.
//            if (j == i)
//            {
//                str[index++] = str[i];
//            }
//        }
//        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
//    }
//
//
//    }
