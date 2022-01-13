package Object;

public class Car {

    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void move() {
        System.out.println("car is moving");
    }

    public boolean move(String dest) {
        System.out.println(brand + " Moving to " + dest);
        return true;
    }

    public String toString() {
        return "My car brand is " + brand;
    }

    protected void finalize(){
        System.out.println("Finalize");
    }
}