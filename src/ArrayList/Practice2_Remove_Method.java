package ArrayList;

import java.util.ArrayList;

public class Practice2_Remove_Method {
    public static void main(String[] args) {

        ArrayList <String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Chicago");
        cities.add(1, "Boston");
        System.out.println(cities.get(1));
        System.out.println(cities);

        cities.remove("Chicago");
        System.out.println(cities);

        cities.remove("chicago");
        System.out.println(cities);




        ArrayList <String> shoes = new ArrayList<>();
        shoes.add("Nike");
        shoes.add("Adidas");
        shoes.addAll(cities);
        System.out.println(shoes);
        shoes.remove("Boston");
        System.out.println(shoes);
        System.out.println(cities);
        shoes.removeAll(cities);
        System.out.println(shoes);

        shoes.remove(1);
        System.out.println(shoes);

        shoes.addAll(0, cities);
        System.out.println(shoes);

        ArrayList <String> animal = new ArrayList<>();
        animal.add("Lion");
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Monkey");
        animal.add("Giraffe");

        //set();-->replace
        System.out.println(animal);
        animal.set(1,"Fox");
        System.out.println(animal);
    }
}
