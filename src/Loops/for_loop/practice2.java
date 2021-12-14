package Loops.for_loop;

public class practice2 {
    public static void main(String[] args) {

        // print out numbers between 0 to 5 decreising by using for loop

        for (int a = 5 ; a >= 0;  a--){
            System.out.println(a);
        }

        // find the total between 1- 5 by using for loop
        int sum = 0;
        for (int number = 1 ; number< 5 ; number++) {
            sum+= number;
            System.out.println(+sum);
        }
        System.out.println(+sum);






    }

}
