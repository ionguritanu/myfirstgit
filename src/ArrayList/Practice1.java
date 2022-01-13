package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        //ArrayList<String> list3 = new ArrayList();

        list1.add("Rose");
        list1.add(21);
        list1.add('a');
        list1.add(4.5);

        System.out.println(list1);

        list1.add(1,"Tulip");
        System.out.println(list1);

        for (int i = 0; i<list1.size();i++){
            System.out.println(list1.get(i));
        }







        int [] numbers = new int[5];
        numbers[2]= 9;
        System.out.println(Arrays.toString(numbers));

        // use for each loop to print out alll elements from each loop

        for ( Object o : list1) {
            System.out.println(o);
        }



                                   //Methode
                         //   add(),    size(),    get()

       System.out.println(list1.get(8));
        list1.add(5,"violet");
        System.out.println(list1);

        System.out.println("============================");


        ArrayList<String> list3 = new ArrayList();
        list3.add("1234");
        list3.add("test");


    }
}
