package Primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int result = --a + --b + a++ * 2 - b++ * a--; // 7
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);


        int donutPrice =2;
        int donutNumber = 12;
        int total = donutPrice * donutNumber;
        System.out.println(total); //DD

        System.out.println(--total); //KK

        char ch= 'a';
        System.out.println(--ch);
        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        ++ch;
        System.out.println(ch);
        System.out.println(--ch);


    }
}
