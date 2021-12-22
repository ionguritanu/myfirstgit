package Array;

import java.util.Arrays;

public class task5_reversing_string {
    public static void main(String[] args) {
    String[] colors = {"white", "black", "red", "pink", "orange"};
    //print out every element in reverse order
    String[] reversed = new String[colors.length];


       for (int a=0; a< colors.length; a++){

           String str = "";

           for(int i = colors[a].length()-1; i>=0; i--){

               str+= colors[a].charAt(i);
           }
           reversed[a]= str;          // where we have to store the new variable
       }
        System.out.println(Arrays.toString(colors));     //original
        System.out.println(Arrays.toString(reversed));   //final result


   }

}

