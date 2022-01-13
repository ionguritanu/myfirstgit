package WrapperClass;
public class StringToPrimitive {
    public static void main(String[] args) {

        String str = "12";
        System.out.println(str + 10);
        int number = Integer.parseInt(str); //unboxing
        System.out.println(number+10);
        Integer number1 = Integer.parseInt(str);
        System.out.println(number1.equals("12"));



       // Byte
          byte by = Byte.parseByte("127");
        System.out.println(by);

        //int number2 = Integer.parseInt("128GB"); // NumberFormatException

        //"true"
       boolean bl = Boolean.parseBoolean("true");
        System.out.println(bl);

        boolean bl3 = Boolean.parseBoolean("sdfs");
        System.out.println(bl3);


       float fl =  Float.parseFloat("1.2");
        System.out.println(fl);

        double fli = Float.parseFloat("1.1");
        System.out.println(fli);

        long lg = Long.parseLong("345L");
        System.out.println(lg);
    }
}
