package StringBuilder;

public class ReplaceCharTask {
    /*
    create a method that will take StringBuilder Array as parameter
    this method wll replace middle char of each element from the
    array if the length of the element is odd number
     */
    public static void replaceChar(StringBuilder[] builder) {
        for (int i = 0; i < builder.length; i++) {
            if (builder[i].length() % 2 == 1) {
                builder[i].replace((builder[i].length()) / 2, builder[i].length() / 2 + 1, "u");
            }
            System.out.println(builder[i]);

        }
    }

    public static void main(String[] args) {
        StringBuilder[] things = new StringBuilder[7];
        things[0] = new StringBuilder("coke");
        things[1] = new StringBuilder("civic");
        things[2] = new StringBuilder("day");
        things[3] = new StringBuilder("ssss");
        things[4] = new StringBuilder("ssss");
        things[5] = new StringBuilder("ssss");
        things[6] = new StringBuilder("sss");
        replaceChar(things);


    }
}

