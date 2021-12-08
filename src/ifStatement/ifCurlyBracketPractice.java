package ifStatement;

public class ifCurlyBracketPractice {
    public static void main(String[] args) {
        int number = 1234;
        if(number==1234)
            System.out.println("Number is equal to 1234");
            System.out.println("Number is not equal to 1234");

            if (number == 5)
                System.out.println("Hello world");
                System.out.println("Hello Java");
                System.out.println("Hello Alex");

                int num1 =6;
                if (num1 < 10)
                    num1++ ;
        System.out.println(num1);

        int num2 = 4;
        if (num2 > 20);
        num2++;
        System.out.println(num2);


        if (num2 > 20){
            num2++;
            System.out.println(num2);
            System.out.println("I am in the curly ===>" + num2);
        }

        int a = 9;
        if ( 1==1 )
            a = 2 +2;
        System.out.println("----------");
        System.out.println(a);


        int capacity = 20;
        int studentNumber = 25;
        if (capacity>studentNumber)
            System.out.println("abc");
        studentNumber++;
        System.out.println(studentNumber);

        
    }
}
