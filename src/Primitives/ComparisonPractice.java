package Primitives;

public class ComparisonPractice {
    public static void main(String[] args) {
        float fl =4;
        int i = 4;
        System.out.println(fl == i);
        boolean comp1 = fl ==i;
        System.out.println(comp1);

        System.out.println(18 ==18);

        System.out.println('a' == 'A');
        System.out.println("test" == "tesT");
        // !=
         int num1 = 55;
         int num2 = 66;

         boolean comp2 = num1 != num2;
        System.out.println(comp2);

        System.out.println(18 != 18); // false

        System.out.println(num1<num2);
        System.out.println(55 < num1);
        System.out.println(num2 < num1);
        System.out.println('c'<'d');

        // > greater than

        System.out.println(num1>num2);
        System.out.println(num2 > 109);
        System.out.println(num2++ > 66);
        System.out.println(num2> 66);

        // <= less than or equals
        num1 = 2; num2=3;
        System.out.println(num1<num2);
        System.out.println(num1<=num2);
        System.out.println(3 <= num2);
        num1++;
        System.out.println(num1 <= num2);
        System.out.println(++num1 <= ++num2);

        // >= greater or equal
        System.out.println(num2>= num1);
        System.out.println(7 >= ++num1 + num2); //false

        char ch3 = 'P';
        char ch4 = 80;
        System.out.println(ch3 ==ch4);




        System.out.println();





    }
}
