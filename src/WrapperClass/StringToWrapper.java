package WrapperClass;

import jdk.swing.interop.SwingInterOpUtils;

public class StringToWrapper {
    public static void main(String[] args) {
         String color = "12";
         Integer number = Integer.valueOf(color);
        System.out.println(number+30);


        Boolean bl =  Boolean.valueOf("TRUE");
        System.out.println(bl);
       Boolean bl1 =  Boolean.valueOf("example");
        System.out.println(bl1);

        int i = Integer.valueOf("77");
        System.out.println(i);

       //Character ch =  Character.valueOf("a"); // compile time error


    }
}
