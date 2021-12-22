package Array.split;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        String str = "Stay safe and Healthy";

       String [] words =  str.split(" ");
        System.out.println(Arrays.toString(words ));
        System.out.println(str);

        // print out every single word as:   .....***
        //System.out.println(Arrays.toString(words));

        for (String x: words ){
            System.out.println(x.concat("***"));
        }


       String []words2 =  str.split("a",4);
        System.out.println(Arrays.toString(words2));
        System.out.println(words2.length);

         /// task

        /// 12/17/2021
        String date = "12_17_2021";
        String [] splitdate1 = date.split("_");
        System.out.println(Arrays.toString(splitdate1));

        /// 12.17.2021
         String Date2 = "12.17.2021";
        String [] splitdate2 = Date2.split("\\.");
        System.out.println("This is for dot example " + Arrays.toString(splitdate2));

        for (String i : splitdate2){
            System.out.println("\"something\"");
        }

       // 12.17.2021 task

        for (String elemnet : splitdate2){
            System.out.println("\""+elemnet+"\"");
        }


    }
}
