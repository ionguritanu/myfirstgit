package Immutable;

public class Phone {

    double price =500;
    String color = "blue";
    String brand = "own";



    //get methode

    public double getPrice() {
        return price;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }


    public static   void main(String[] args) {

        Phone phone =new Phone();
        System.out.println(phone.price);;
        phone.price=900;
        System.out.println(phone.price);
    }

}
