package Java_Coding_Interview_questions;

import java.util.Arrays;

public class Swaping_test {
    public static void main (String[] args) {
        // write a methode to revers a string

        //String Buffer
        String abc = "I start loving Java";

        StringBuffer a = new StringBuffer(abc);
        System.out.println("StringBuffer -->       " +a.reverse());


        // StringBuilder
        StringBuilder s = new StringBuilder(abc);
        System.out.println("StringBulder -->       " + s.reverse());


        //charAt();
        String update = "";
        for(int i= abc.length()-1; i>=0; i--){
            update= update+ abc.charAt(i);
        }
        System.out.println("charAt()               "+update);


        //charArray();
      String q = "";
      char[] r = abc.toCharArray();
      for (int f = r.length-1; f>=0; f--){
          q+=r[f];
      }
        System.out.println("charArray()            "+q);
    }
}
