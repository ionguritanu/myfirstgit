package zHomework6;

import java.util.Scanner;

public class task5_upperCase_lowerCase {
    public static void main(String[] args) {

//Ask user to enter a password
//
//1 - > If the string doesn't have any upper case letter or any lower case letter print "Your password is not acceptable"
//
//2 - > If the first character of the password is upper case letter and last character of the password is not letter print "Your password is strong".
//
//3 - > If first character of the password is lower case letter and last character of the string is upper case print "Your password should be improved"
//
//4 - > For all other conditions print "Your password is not valid"
//
//For this task you should use if else statement.
//
//This is the hardest task in this week's homework and I will send solution for this task on Monday.
//
//Good Luck !



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password");

        String password = scanner.nextLine();

        int firstCharacter = password.charAt(0);
        int lastCharacter = password.charAt(password.length()-1);

        boolean a = (password == password.toLowerCase() || password == password.toUpperCase());

        boolean b = (firstCharacter >= 65 && firstCharacter <= 90);

        boolean c = ((lastCharacter < 64 || lastCharacter > 122) || (lastCharacter > 91 && lastCharacter < 97));

        boolean d = (firstCharacter >= 97 && firstCharacter <= 122);

        boolean e = (lastCharacter >= 65 && lastCharacter <= 90);

        if (a == true){
            System.out.println("Your password is not acceptable");
        }else if (b == true && c == true){
            System.out.println("Your password is strong");
        }else if (d == true && e == true){
            System.out.println("Your password should be improved");
        }else{
            System.out.println("Your password is not valid");
        }
    }
}
