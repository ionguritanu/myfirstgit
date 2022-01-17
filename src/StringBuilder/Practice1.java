package StringBuilder;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practice1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Techtorial");
        //charAt;
        Character ch = builder.charAt(2);
        System.out.println(ch);

        // lenght();
       // Byte b = (byte)

        //index
        System.out.println(builder.indexOf("t"));
        System.out.println(builder.indexOf("t", 3)); //4

        //substring()
        System.out.println(builder.substring(5));
        String sub = builder.substring(5);
        //StringBuilder sub1 = builder.substring(5);
        StringBuilder sub2 = new StringBuilder(builder.substring(5));
        StringBuilder sub3 = new StringBuilder(sub);
        System.out.println(builder.substring(2,5));

        // insert();
        System.out.println( builder.insert(4,"Tech"));

        builder.insert(builder.length(), " Academy");
        System.out.println(builder);


        //delete()
        builder.delete(0,4);
        System.out.println(builder);

        //deleteCharAt()
        builder.deleteCharAt(builder.indexOf(" "));
        System.out.println(builder);

        // reverse this builder
        StringBuilder builder2 = new StringBuilder();
        for (int i = builder.length()-1; i>-1; i--){
            builder2.append(builder.charAt(i));
        }
        System.out.println(builder2);

        builder.reverse();
        System.out.println(builder);
        System.out.println(builder.reverse());


        //replace()
        builder.replace(4,10,"$$");
        System.out.println(builder);
        builder.replace(builder.indexOf("$"), builder.lastIndexOf("$")+1, "**");
        System.out.println(builder);

        //toString
        // it converts String Builder object into String

        String string = builder.toString();
        System.out.println(builder);
        string = string.concat(" Student");
        System.out.println(string);



        }
    }

