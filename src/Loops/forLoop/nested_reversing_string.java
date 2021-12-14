package Loops.forLoop;

public class nested_reversing_string {
    public static void main(String[] args) {
        // revers given string
        String str = "Lets do it";

        String reversed = "";

        for(int i = str.length()-1; i>= 0; i--){


            reversed+= str.charAt(i);
        }

        System.out.println(str);
        System.out.println(reversed);


        }
    }
