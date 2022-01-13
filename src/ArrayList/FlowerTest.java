package ArrayList;

import java.util.ArrayList;

public class FlowerTest {
    public static void main(String[] args) {
        //creating the arrayList
        Flower c1 = new Flower("white", "Tulip", 22);
        Flower c2 = new Flower("green", "Rose", 33);
        Flower c3 = new Flower("yello", "Pepper", 5);


        ArrayList<Flower> fl = new ArrayList();
        fl.add(c1);
        fl.add(c2);
        fl.add(c3);

        for (Flower flower : fl) {
            System.out.println(flower.name + " is " + " = $" + flower.price);
        }
       // System.out.println(totalPrice(ArrayList<Flower>));                check the git hub for this line
        //calling totalPrice
        //int flowerCost = Flower
    }


    //create a methode that will take parameter as arrayList of Flower
    //and will return total prices of flowers

    public static int totalPrice (ArrayList<Flower> vase) {
        int sum = 0;
        for (Flower flower : vase) {
            sum += flower.price;
        }
        return sum;
    }

}