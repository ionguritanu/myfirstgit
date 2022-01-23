package OOP.Inheritance1;

import java.util.concurrent.Flow;

public class Rose extends Flower {   //rose is child of the flower

    String smell;
    double price;

    public Rose(String smell) {

        super("Red", 4.99, 9);
        this.smell = smell;
    }

    // override the methode
    public double getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Flower flower = new Flower("yellow", 2.99, 5);
        System.out.println(flower.color);
        Rose rose = new Rose("sweet");
        System.out.println(rose.color);
        System.out.println(flower.price);
        System.out.println(flower.getPrice());
        System.out.println(rose.getPrice());  //4.99
        System.out.println(rose.price);

        Flower flower1 = new Flower();
        System.out.println(flower1.getPrice());
        System.out.println(flower1.size);
        flower1.price = 8.99;
        System.out.println(flower1.getPrice());
        System.out.println(flower1.price);
        System.out.println(flower1);
        System.out.println(rose);


    }
}