package Object;

public class testMathPractice {
    public static void main(String[] args) {


        MathPractice math1 = new MathPractice();
        math1.sum();

        math1.total(4,5);
        math1.total(4,7);
        math1.total(4,88);

       // System.out.println(math1.sum());
        // no void return type, not working

       int a= math1.sum2(2,3);
       int x = a*a;
        System.out.println(x);

        String str = math1.speak();
        System.out.println(str);

        System.out.println(math1.speak());

        // call numbertostring methode and do concatenation
        //with you first and last name and print it out

       String update = math1.numberToString(6.9);
       update = update.concat(" Ion") ;
       System.out.println(update);

       String update1 = math1.numberToString(3);
       update1= update1.concat(" Ion G");
        System.out.println(update1);
    }
}