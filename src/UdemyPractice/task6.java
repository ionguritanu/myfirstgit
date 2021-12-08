package UdemyPractice;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

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
