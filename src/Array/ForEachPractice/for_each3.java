package Array.ForEachPractice;

import java.util.Arrays;

public class for_each3 {
    public static void main(String[] args) {
        String [] names = {"John", "Brian", "Easy", "Nina", "David"};
        String [] gMails = new String[names.length];
        String [] yahooMails = new String[names.length];

        // to create e-mail address for each the email in array
        //john@gmail.com......
        // store e-mainl in array if it is gmail e-mail, store int in gmail array
        // if it is yahoo e-amil, store it in yahoo

        for(String name : names){
            System.out.println(name + " @gmail.com");
            System.out.println(name + " @yahoo.com");

        }
        for(int i =0; i< names.length; i++){
            String email = names[i] + "@gmail.com)";
            String yMail = names[i].toUpperCase().concat("@yahoo.com");

            gMails[i] = email;
            yahooMails[i] = yMail;
        }
        System.out.println(Arrays.toString(gMails));
        System.out.println(Arrays.toString(yahooMails));
    }
}
