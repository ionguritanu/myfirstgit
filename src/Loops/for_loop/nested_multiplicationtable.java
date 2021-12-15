package Loops.for_loop;

public class nested_multiplicationtable {

    public static void main(String[] args) {


        // create a multiplication table

       for  (int num =1 ; num <= 5; num++ ){

           for (int k = 1; k<11 ; k++){

               System.out.println( num + " * " + k + " = " + num * k);
           }
       }
    }
}
