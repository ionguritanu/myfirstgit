package ArrayList;

import java.util.ArrayList;

public class Practice5_test {
    public static void main(String[] args) {
        //store 5 comp object into arraylist

        Practice5_Computer_Constructor c1 = new Practice5_Computer_Constructor("Mac" ,
                1600, 44, "White",  256);
        Practice5_Computer_Constructor c2 = new Practice5_Computer_Constructor("HP" ,
                1000, 44, "White",  256);
        Practice5_Computer_Constructor c3 = new Practice5_Computer_Constructor("Dell" ,
                1000, 44, "White",  256);
        Practice5_Computer_Constructor c4 = new Practice5_Computer_Constructor("Lenovo" ,
                1000, 44, "White",  256);
        Practice5_Computer_Constructor c5 = new Practice5_Computer_Constructor("Mac" ,
                999, 44, "White",  256);

        ArrayList<Practice5_Computer_Constructor> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        System.out.println(list);

        //reach out to all MAC computer and show it

        ArrayList<Practice5_Computer_Constructor> macComputer = new ArrayList<>();  //to add it in different arrayList

        for (Practice5_Computer_Constructor device : list ){


            if(device.brand.equalsIgnoreCase("mac")){
                System.out.println(device);
                System.out.println(device.brand);
                System.out.println(device.price);
                macComputer.add(device);
                //list.remove(device);
            }
        }
        System.out.println(macComputer);
    }
}
