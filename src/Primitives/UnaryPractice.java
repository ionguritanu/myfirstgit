package Primitives;

public class UnaryPractice {
    public static void main(String[] args) {
        int studentNumber = 25;

        studentNumber= studentNumber++;
        System.out.println(studentNumber); // shows 25 but is 26
        studentNumber = ++studentNumber;
        System.out.println(studentNumber);

        studentNumber++;
        System.out.println(studentNumber);

        int count = 5;
        System.out.println(count++); // 5
        System.out.println(++count); // 7

        int count1 = 5;
        System.out.println(++count1);

        //===============

        System.out.println(count++);

        //===========

        int number = 8;
        System.out.println(number--); // shows 8 but is 7
        System.out.println(number--); // 7 but is 6
        System.out.println(--number); // shows 5 and is 5


        number++;
        System.out.println(number++ + number++); //shows 13 number is 8

        int result = --number + --number + 2 - number++ * 2;
        System.out.println(result); // result 3
        System.out.println(number); // number 7

        //=============

        int a = ++number;
        System.out.println(a);


    }
}
