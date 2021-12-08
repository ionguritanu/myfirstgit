package String;

import com.sun.security.jgss.GSSUtil;

public class Methods7 {
    public static void main(String[] args) {
        String name = "    Techtorial Academy is located at Des Plains        ";

        //trim() --> it will remove the spaces before and after the string

       String updatedName =  name.trim();
        System.out.println(updatedName);
        System.out.println(name);

        // subString()

        String part1 = updatedName.substring(4);
        System.out.println(part1);

        String part2 =updatedName.substring(4,12 ); // the char at first index is included but char at the second index
                                                    // is not included
        System.out.println(part2);


    }
}
