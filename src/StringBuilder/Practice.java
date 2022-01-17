package StringBuilder;

public class Practice {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder("Techtorial");  //constructor
        // StringBuilder builder2 = "Java"; IT WILL NOT COMPILE

        System.out.println(builder);
        builder.append("Winter");
        System.out.println(builder);
        builder.append(" is cold");
        System.out.println(builder);

        String str = "";

        for (char ch = 'a'; ch<='z'; ch++){
            str+= ch;
            System.out.println(str);
        }

        StringBuilder builer2 =new StringBuilder();
        for (char ch = 'a'; ch<='z'; ch++){
        builer2.append(ch);
        System.out.println(builer2);
        }

       //Winter is coldd

        builder.append(" "+ 33 );
        builder.append(" "+false);
        System.out.println(builder);
        builder.append(" degree").append(" negative").append('&'+ " ");
        System.out.println();

        StringBuilder succes = new StringBuilder("Working Hard");
        succes.append(" does not make success");
        StringBuilder truth =succes.append("Thinking hard makes you success");
        System.out.println(succes);
        System.out.println(truth);

        StringBuilder success1 = new StringBuilder("Tech");
        success1.append("torial");

        StringBuilder truth1 = success1.append(" 2020");
        truth1=truth1.append(" Best ").append("Summer");
        System.out.println(success1);
        System.out.println(truth1);

    }
}
