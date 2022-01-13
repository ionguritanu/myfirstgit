package Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {
        String string = "Ping Pong";
        string = string.replace(" ", "");
        HashMap<Character, Integer> countAndStore = new HashMap<Character, Integer>();

        for (int i = 0; i < string.length(); i++) {

            if (!countAndStore.containsKey(string.charAt(i))) {

                countAndStore.put(string.charAt(i), 1);
            } else {
                countAndStore.put(string.charAt(i), countAndStore.get(string.charAt(i)) + 1);
            }
        }
        System.out.println(countAndStore);
    }
}
