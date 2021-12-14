package Loops.forLoop;

public class infiniteLoop {
    public static void main(String[] args) {

        for (int k = 0; k<5; k++){
            System.out.println("david");
        }


        // for infinite loop
        int x = 0;
        for(     ;   ;     ){
            System.out.println("Zack");
            x++;
            System.out.println(x);
        }

       // System.out.println(x); after infinite will not be reached because of type of the loop
    }
}
