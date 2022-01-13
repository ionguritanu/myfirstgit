package zProject1.zProject5;

import java.util.Scanner;

public class task7_find_uppercase_split {
    public static void main(String[] args) {
        //Using a scanner enter a sentence that is not separated by space and each word
        //starts with upper case. Print given String as separated words with spaces
        //Given Value: "IWantToLearnJava"
        //Output: I Want To Learn Java
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String update = "";
        for(int i = 0; i < sentence.length(); i++) {
            Character a = sentence.charAt(i);
            if(Character.isUpperCase(a))
                update +=  " " + Character.toString(a);
            else
                update += a;
        }
        System.out.println(update.trim());

    }
}
