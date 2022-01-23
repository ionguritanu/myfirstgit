package OOP.InheritanceTask;

public class Car extends Vehicle {

String model;
String engineType;

    public Car (){
        super("Camry", 2022, "Toyota");
    }

    public void drive() {
        System.out.println("Car is moving");
    }

   Car accelerate(String model, int year, String brand){
       System.out.println(super.model);
       System.out.println("Car is accelerating");
       Car car = new Car();

       return  car;
   }

    public static void main(String[] args) {
     Car car = new Car();


   //car.accelerate();



    }
}
