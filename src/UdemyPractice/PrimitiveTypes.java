package UdemyPractice;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value =" + myMinIntValue);
        System.out.println("Integer maximum value =" + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        byte num1 = 20;
        short num2 = 2;
        int num3 = 3;
        long num4 = 50000L +20L *(num1 + num2 +num3);
        System.out.println(num4);


        double pounds1 = 200;
        double poundToKg = 0.45359237;
        double trasnTotal = pounds1 * poundToKg;
        System.out.println(trasnTotal);


    }
}
