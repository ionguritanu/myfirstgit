package Set;

import com.sun.security.jgss.GSSUtil;

import javax.swing.plaf.basic.BasicLabelUI;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Practice2 {

    public static void main(String[] args) {

        HashSet<String > colorsHash = new HashSet<>();
        LinkedHashSet <String> colorsLinked = new LinkedHashSet<>();
        TreeSet<String> colorTree = new TreeSet<>();

//                mixed                    order                      ascending order
        colorsHash.add("White");     colorsLinked.add("White");    colorTree.add("White");
        colorsHash.add("Blue");      colorsLinked.add("Blue");     colorTree.add("Blue");
        colorsHash.add("Black");     colorsLinked.add("Black");    colorTree.add("Black");
        colorsHash.add("Pink");      colorsLinked.add("Pink");     colorTree.add("Pink");
        colorsHash.add("Red");       colorsLinked.add("Red");      colorTree.add("Red");
        colorsHash.add(null);        colorsLinked.add(null);       //colorTree.add(null);

        System.out.println(colorsHash);
        System.out.println(colorsLinked);
        System.out.println(colorTree);


        //System.out.println(colorTree.descendingSet());
        colorTree.descendingSet();
        Set<String> example = colorTree.descendingSet();
        System.out.println(example);
        System.out.println(colorsHash);


    }
}
