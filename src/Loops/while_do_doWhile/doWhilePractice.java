package Loops.while_do_doWhile;

import java.sql.SQLOutput;

public class doWhilePractice {
    public static void main(String[] args) {

        // show your age from 21-26

        int age = 21;
        do{
            System.out.println("your age is: " + age);
            age++;
        }while(age<10);

        System.out.println("=====================");

        age= 21;
        do{

            System.out.println("your age is: " + age);
            age++;
        }while (age <27);


        System.out.println("================");


        age = 21;
        while (age<12);
        System.out.println(age);
        age++;
    }
}
