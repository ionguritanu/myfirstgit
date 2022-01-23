package OOP.Inheritance1;

public class Flower {

    String color;
    double price;
    int size;

    //creating constructor
    public Flower (String color, double price, int size){
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Flower(){

    }




public double getPrice(){
        return price;
}

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
