package String;

import java.sql.SQLOutput;

public class MethodsTask2 {
    public static void main(String[] args) {
//        ===Task==
//String str = " Zero to Ten  ";
//- change 'Ten' with/to 'HERO'
//- make all of the string uppercase
//- remove all spaces
//- get only first three letter
//- print the length of those three letters as ==> "The length of final verison is: +  <length>"
//Collapse

        String str = " Zero to Ten ";
        String change = str.replace("Zero", "HERO");
        System.out.println(change);

        str = str.toUpperCase();
        System.out.println(str);

        str = str.trim();
        System.out.println(str);

        str = str.replace("", "");
        System.out.println(str);

        str = str.substring(0,3);
        System.out.println(str);

        int x = str.length();
        System.out.println("The length of final version is " + x);

        // method chaining --> you can use method ofter method


        str = " Zero to Ten ";


        int a = str.replace("Ten", "HERO").toUpperCase().trim().replace(" ", " ").
                substring(0,3).length();
        System.out.println(a);

      //        int a = str.replace("Ten", "HERO").
        //        toUpperCase().
        //        trim().
        //        replace(" ", " ").
        //        substring(0,3).
        //        length();
        //        System.out.println(a);







    }
}
