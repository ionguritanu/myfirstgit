package Primitives;

import java.sql.SQLOutput;

public class Farm {
    public static void main(String[] args) {
        /*in a farm are 12 cows and 23 chickens
        1. find the total legs of the animals in the farm and sout
        2. if each cow cost $ 2345 and each chicken cost 23.99
        find the total
         */
        int cow =12;
        int  chicken = 23;
        int totalLeg = chicken *2 + cow *4;
        System.out.println(totalLeg);

        double cow$ = 2345;
        double chicken$ = 23.99;
        double total$ = cow * cow$ + chicken * chicken$;
        System.out.println(total$);

    }

}
