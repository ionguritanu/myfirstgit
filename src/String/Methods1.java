package String;

public class Methods1 {
    public static void main(String[] args) {
        String device ="microphone";

        device.concat("is an input device");
        System.out.println(device);

        char ch = device.charAt(1);
        System.out.println(ch);


        int letterCount = device.length(); //returns a number
        System.out.println(letterCount);
        device += "is expensive ";
        device.concat(" device ");
        device = device.concat(" device");
        System.out.println(device.length());
        System.out.println(device.length());

        // take last char from this last version of the string


        System.out.println(device.charAt(29));

        String example = " The life is very easy and the turkey was good.";
        char lastChar = example.charAt(example.length()-1);
        System.out.println(lastChar);


       String example2 = "Thanksgiving is over. The price of the turkey will go down. So you can find " +
               "more inexpensive purchase";
          int count =  example2.length();
          int lastLetter  = example2.charAt(count-1);
          System.out.println(lastLetter);


        // find the middle char from last string

        int lastLetter1 = example2.charAt(count-1)/2;
        System.out.println(lastLetter1);

        String school = "Techtorial";
        System.out.println(school.charAt((school.length()/2)));

        System.out.println(school.charAt(15)); // since there is no 15th index

    }
}
