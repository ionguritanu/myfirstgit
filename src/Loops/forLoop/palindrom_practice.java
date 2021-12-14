package Loops.forLoop;

public class palindrom_practice {
    public static void main(String[] args) {


        String str = "civic";
        String reversed = "";


        for(int i = str.length()-1; i>= 0; i--){

            reversed+= str.charAt(i);
        }

        if (reversed.equalsIgnoreCase(str)){
            System.out.println("it is polindrom string");

        }else{
            System.out.println("is not polindrom");
        }



        //// Exemple with numer

       // find out if given number is palindrome or not


        int number = 1234321;
        String str1 = ""+number;

        // to do at home
    }
}
