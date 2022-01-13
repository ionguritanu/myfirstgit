package Object;

import java.sql.SQLOutput;

public class Phone {

    String brand;
    double price = 1000;
    String color;

    // constructor 1
    public Phone (){
        this("Navy Blue"," Nokia");

        System.out.println("This is No argument constructor");
    }
    // constructor 2
    public Phone(String newColor){
        this.color = newColor;
        System.out.println("This is the constructor for the color");
    }

    // constructor 2
     public Phone(String newColor, String newBrand){
        this.color=newColor;
        this.brand= newBrand;
         System.out.println("This is constructor for constructor3");
}






   //methode to set color
    public void setColor(String color1){
        color=color1;
        //creating another instance variable inside the block
        System.out.println("color of my phone is " + color1);
    }


  //methode to call
    public void call(int number){
        System.out.println(number + " is being called");
    }

}
