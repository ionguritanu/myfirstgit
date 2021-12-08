package ifStatement;

public class ifPractice {
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;

        // ==, <, >, !=, <=, >=

        System.out.println("I am about to create an IF block");

        if( appleNumber == orangeNumber){
            System.out.println("I am so lucky today!");
        }

        if (appleNumber != orangeNumber){
            System.out.println("I am so happy today!");
        }

        if( appleNumber<=orangeNumber){
            int sum = appleNumber + orangeNumber;
            System.out.println("You have " + sum + " fruits");
        }
        System.out.println("So far so good");

        if (orangeNumber<appleNumber){
            System.out.println(orangeNumber * appleNumber + " is in the false conditional if block.");
        }
        ///////
//
//        int number = 1234;      "number" - is not a condition
//        if (number){
//            System.out.println("Hello world");
//        }
    }
}
