package Object;

public class Cat {

    String name;
    int age;
    String color;
    int foodAmount;

    // create a methode named
    // as run(), it will take a parameter as destination
    // it will reduce food amount by 1 for every execution
    // it will print out as "Cat is running ..<west>"

   //overload the run methode
    public void run (String destination){
        foodAmount -= 1;
        System.out.println(name + " is running to " + destination);
    }

    public void run(){
        System.out.println("Overloaded run method in the Cat class )");
    }


// create a methode named as setColor(), it will take parameter and initialize the color of the cat

    public void setColor(String newColor){
        color= newColor;
        System.out.println();
    }

    //creat a methode that will return color of cat , nam it as getColor

    public String getColor( ){
        return color;
    }



    //=========

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name= "Ginger";
        cat1.color = "White";
        cat1.age = 4;
        cat1.foodAmount = 10;
        cat1.run("up");
        System.out.println(cat1.foodAmount);
        cat1.setColor("white");
        System.out.println(cat1.color);
        System.out.println("this is coming from get color methode and is " +  cat1.getColor());


        MethodePractice1 abc2 = new MethodePractice1();
        abc2.ageCalculator(1990, "Ion");

    }

}

