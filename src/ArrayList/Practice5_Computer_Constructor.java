package ArrayList;

public class Practice5_Computer_Constructor {
    String brand;
    double price;
    double screenSize;
    String color;
    int storage;

    public Practice5_Computer_Constructor(String brand, double price, double screenSize, String color, int storage){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.screenSize = screenSize;
        this.storage= storage;

    }

    @Override
    public String toString() {
        return "Practice5_Computer_Constructor{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                '}';
    }
}
