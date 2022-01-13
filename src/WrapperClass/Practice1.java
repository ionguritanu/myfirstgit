package WrapperClass;

import java.time.LocalDateTime;

public class Practice1 {
    public static void main(String[] args) {
        byte b = 2;

        Byte bt = new Byte(b);  //object
        System.out.println(bt);

        short s = 7;
        Short sh = new Short(s);
        System.out.println(sh);

        char c = 'a';
        Character ch = new Character('a');
        System.out.println(ch);


        Integer integer = new Integer(5);

        Float fl = new Float(3.5);

        Double db = new Double(4.5);

        Long lg  = new Long(123);

        Boolean bl = new Boolean(true);
        System.out.println(bl);


        int i = new Integer(22);    // UnBoxing--> when java converts wrapper class to primitive data
        Integer number = i;               // or any other number ex 3 //AutoBoxing
        // AutoBoxing - when you store primitive data to wrapper class object without creating wrapper class
        System.out.println(number.toString().concat("aksjnfks"));

    }
}
