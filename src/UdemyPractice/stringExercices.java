package UdemyPractice;

public class stringExercices {
    public static void main(String[] args) {

        String hannah = "Did Hannah see bees? Hannah did.";

        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.indexOf('b'));

//
        String second = "Was it a car or a cat I saw?"; //.substring(9, 12)
        System.out.println(second.substring(9,12));

   //

        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

//        /*1*/   result.setCharAt(0, original.charAt(0));
//        /*2*/   result.setCharAt(1, original.charAt(original.length()-1));
//        /*3*/   result.insert(1, original.charAt(4));
//        /*4*/   result.append(original.substring(1,4));
     //   /*5*/   result.insert(3, (original.substring(index, index+2) + " "));

        System.out.println(result);

       // Show two ways to concatenate the following two strings together to get the string "Hi, mom.":

        String hi = "Hi, ";
        String mom = "mom.";

        System.out.println("Hi, " + " mom.");
        System.out.println(hi.concat(mom));

// Write a program that computes your initials from your full name and displays them.

        String first = "Ion";
        String last = "Guritanu";
        System.out.println(first.charAt(0));
        System.out.println(last.charAt(0));


        //An anagram is a word or a phrase made by transposing the letters of another word or phrase; for example,
        // "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft."
        // Write a program that figures out whether one string is an anagram of another string.
        // The program should ignore white space and punctuation.



    }
}
