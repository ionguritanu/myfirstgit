package ifStatement;

public class elseIfPractice {
    public static void main(String[] args) {
        // pick a number btwn 0-25
        //    for each range of 0-5, 6-10, ... >> your number is in the range of 0 to 5 etc.
        int a = 4;
        if (a>0 && a<=5 ){
            System.out.println("your num is in range of 0-5");
        } else if (a>=6 && a<=10){
            System.out.println("your num is in range of 6-10");
        } else if (a >=11 && a<= 15){
            System.out.println("your num is in range 11 - 15");
        } else {
            System.out.println("is out of range");
        }

        // recap
        int z = 14 ;
        if(z>=0 && z<= 5){
            System.out.println("Your phone number is in range of 0-5");
        }else if(z>=6 && z<=10){
            System.out.println("Your phone num ber is in range of 6-10");
        }else if(z>=11&&z<=15){
            System.out.println("your phone number is in range of 11-15");
        }else{
            System.out.println("Your phone number is not part of our area code");
        }
    }
}
