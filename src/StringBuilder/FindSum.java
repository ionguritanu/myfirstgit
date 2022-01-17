package StringBuilder;

public class FindSum {


    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("turs4o-9-i-2");
        sum(stringBuilder);
    }



    //public static void main(String[] args) {
    public static void sum(StringBuilder builder) {
        double sum = 0;
        for (int i = 0; i < builder.length(); i++) {

            if (Character.isDigit(builder.charAt(i))) {
                String str =""+ builder.charAt(i);
            double num = Double.parseDouble(str);
            sum+= num;
            }

        }
        System.out.println(sum);

    }
}

