package String;

import java.util.Locale;

public class Methods2 {
    public static void main(String[] args) {
        String flower = "Rose";
        int indexOfR = flower.indexOf('R');
        int indexOfR1 = flower.indexOf("R");
        System.out.println("first implementation" + indexOfR);
        System.out.println("second implementation" + indexOfR1);

        System.out.println(flower.indexOf("o"));  // 1
        System.out.println(flower.indexOf("os")); // 1
        System.out.println(flower.indexOf("o,s")); // if it does it find matching char/char sequence
                                                   // it will return -1
        System.out.println(flower.indexOf("r"));   // -1
        System.out.println(flower.indexOf("Rose")); // 0
        System.out.println(flower.indexOf("rose")); // -1
        System.out.println(flower.indexOf("Roses")); // -1

        String object = "umbrellam";
        System.out.println(object.indexOf('l')); // 5
        System.out.println(object.indexOf('l',6));
        System.out.println(object.indexOf('m', object.indexOf('m')+1));
        System.out.println(object.length());

        String sentence = "I love lilies";
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));

        // toUppercase() --> make your string Uppercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        // toLowercase() --> makes string as lowercase
        System.out.println(sentence.toLowerCase());

        //think about making single letter uppercase from a string

        String str = "Just do it";

        // indexOf() --> returning number
        // charAt() --> returning char

        char letter = str.charAt(str.indexOf("d"));
        String str2 = "";
        str2 += letter;
        System.out.println(str2.toUpperCase());



    }
}
