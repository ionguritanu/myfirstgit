package String;

public class MethodChaining {
    public static void main(String[] args) {
        String name = "                   David          ";

        char letter  = name.substring(5).substring(2).toUpperCase().replace("a","xxxx").trim().charAt(1);
        System.out.println(letter);


        String n  = name.substring(5).substring(2).toUpperCase().replace("a","xxxx").trim();
        System.out.println(n);

        System.out.println(name);


    }
}
