package Array.split;

import java.util.Arrays;

public class splitPractice2 {
    public static void main(String[] args) {
        String str = "These files are checked into the repository so that the ignore patterns in them are available to the entire team. Therefore, it is a most common place to store the ignored file patterns.\n" +
                "If there is no .gitignore file in the VCS root directory, you can right-click anywhere in the Project window, choose New | File and type .gitignore in the New File dialog";

        //find even words and if they repets
        // get rid of comma
        //get rid of dot
        //

        String text = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ') {

                text += str.charAt(i);
            }
        }
        System.out.println(text);

        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        int count = 0;
        for (String element : words) {
            if (element.length() % 2 == 0){
                System.out.println(element);
                count++;

            }
        }
        System.out.println(count);

    }
}