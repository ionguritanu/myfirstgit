package Loops;

public class doWhilePractice2 {
    public static void main(String[] args) {

        //find and show sum of the num between 10 -20 bu using do-while loop

        int  a = 10;
        int b = 20;
        int sum = 0;

        do{
            sum+=a;
            a++;

        }while (a<b);

        System.out.println("sum is " + sum);
    }

}
