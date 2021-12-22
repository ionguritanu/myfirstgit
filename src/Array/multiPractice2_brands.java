package Array;

public class multiPractice2_brands {
    public static void main(String[] args) {
        //==Task==:
        //BRANDS of ITEMS:
        //!Computers
        //Apple, Lenova, HP, DEll, Acer
        //!TVs
        //Samsung, LG, Sony
        //!Speakers
        //Alexa, Google, Logitec, JBL
        //--------------
        //PRICES of ITEMS:
        //!Computers
        //Apple-2500, Lenova-1600, HP-1800, DEll-1900, Acer-1100
        //!TVs
        //Samsung-2199, LG-1799, Sony-1599
        //!Speakers
        //Alexa-79.99, Google-89.99, Logitec-64.99, JBL-55.99
        //// STORE Brand in a multidimensional array
        //// STORE Prices in a multidimensional array
        //// print out prices for each product as:
        //// "price for Apple is $2500"

        String[][] items = {{"Apple", "Lenova", "HP", "Dell", "Acer"}, {"Samsung", "LG", "sony"}, {"Alexa", "Google", "Logitec", "JBl"}};
        double[][] prices = {{2500, 1599, 1900, 1100}, {2199, 1799, 1599}, {79.99, 89.99, 64.99, 55.99}};

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(items[i][j] + " is $ " + prices[i][j]);
                if (prices[i][j] > 1000){
                    break;
                }

            }
        }
    }
}
//
//        for (String[] computer : items) {
//            for (String tv : computer) {
//                System.out.println(tv);
//
//        for (double[])
//            }
