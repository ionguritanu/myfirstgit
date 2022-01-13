package Object;

import java.sql.SQLOutput;

public class Phone_test {
    public static void main(String[] args) {


        Phone phone = new Phone();


//        phone.brand= "iphone";
//        phone.call(34);
//        phone.setColor("white");
        System.out.println("***"+phone.color);
        Phone phone1 = new Phone();


        Phone phone2= new Phone("Pink");
        System.out.println(phone2.color);

        Phone phone3 = new Phone("Black", "Samsung");
        System.out.println();
    }
}
