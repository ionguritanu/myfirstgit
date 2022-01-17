package Blocks;

public class block {

    String lastName;
    String name;
    static String color;
    // instance block runs for every object
    // initialize instance variables

        {
            this.lastName = "Karol";
            name = "Joe";
            System.out.println("This is Instance block");
        }
        //static block runs everything in the class
        //initialized instance variables
        static{
            color = "white";
            System.out.println("This is Static block");
        }

    public static void main(String[] args) {
        block o = new block();
        block o1 = new block();

    }
 }

