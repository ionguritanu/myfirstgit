package Loops.forLoop;

public class charPrtactice {
    public static void main(String[] args) {
        //print out lowercase alphabet

        for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
            System.out.print(ch1 + " ");
        }
        System.out.println("================" );
        for (char ch1 = 'z'; ch1 >= 'a'; ch1--) {
            System.out.print(ch1 + " ");
        }
    }
}