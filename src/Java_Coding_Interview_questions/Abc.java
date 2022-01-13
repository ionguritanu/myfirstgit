package Java_Coding_Interview_questions;

import java.util.Arrays;

public class Abc {
    public static void main(String[] args) {


        int[] ids = {1, 2, 3, 4, 5, 6};
        int[] reversed = new int[ids.length];
        int store = 0;
        for (int i = ids.length - 1; i >= 0; i--) {
            reversed[store] = ids[i];
            store++;
        }
        System.out.println(Arrays.toString(reversed));


        String city = "Arlington Heights";
        String rev = "";
        for (int i = city.length() - 1; i >= 0; i--) {
            rev = rev + city.charAt(i);
        }
        System.out.println(rev);


        String sentance = "I love Java";
        String reversedString  = "";
        for(int i = sentance.length()-1; i>= 0; i--){
            reversedString = reversedString+ sentance.charAt(i);

        }
        System.out.println(reversedString);

        String adress = "Hello World";
        String toStore = "";
        for(int i= adress.length()-1; i >=0; i--){
        toStore = toStore + adress.charAt(i);

}
        System.out.println(toStore);


         String [] names = {"Ion", "Elena"};
         String [] reversed1 = new String[names.length];
         int a = 0;
         for( int s = names.length-1;s >=0; s-- ){
             reversed1[a]= names[s];
             a++;
         }
        System.out.println(Arrays.toString(reversed1));

    }
}