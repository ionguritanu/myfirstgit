package Loops.for_loop;

public class practice3 {
    public static void main(String[] args) {

        //pint out every letter from the string using for loop
        //print index number of the letter and a '*' togehether
        String str = "Today is Snowy";


        for (int i = 0; i < str.length(); i++) {
            System.out.print(i + "*" + str.charAt(i) + " ");

        }


        //print out only letter 'y' from the string

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'y') {
                System.out.println(i + " " + str.charAt(i) + " ");

            }

            // count the number of letter 'n' in the given string
            int count = 0;

            for (int b = 0; i < str.length(); i++) {

                if (str.charAt(b) == 'n') {


                } count++;

            }
            System.out.println(count);
        }
    }
}