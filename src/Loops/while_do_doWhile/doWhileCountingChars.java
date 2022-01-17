package Loops.while_do_doWhile;

public class doWhileCountingChars {
    public static void main(String[] args) {

//        -count letters, digits and other characters in the String
//        String str = "$3%GTlk64mn^y?";
//        sout("There are <..> letters in the string");
//        sout("There are <..> digits in the string");


        String str = "$3%GTlk64mn^y?".toUpperCase();
        int index = 0;
        int letterCounter = 0, digitCounter = 0, charCounter = 0;
        do {
            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                letterCounter++;
            } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                digitCounter++;
            } else {
                charCounter++;
            }
            index++;
        } while (index < str.length());
        System.out.println("There are " + letterCounter + " letters in the string");
        System.out.println("There are " + digitCounter + " numbers in the string");
        System.out.println("There are " + charCounter + " symbols in the string");


        System.out.println("=================    Recap");
        //Recap

        String string = "%dtGflk64Mn^y?".toUpperCase();
        int firstIndex = 0;
        int lettersCount = 0;
        int digitsCount = 0;
        int characterCount =0;


        do {
            if (string.charAt(firstIndex)>= 'A' && string.charAt(firstIndex)<='Z'){
                letterCounter++;
            }else if
            (string.charAt(firstIndex)>='0' && string.charAt(firstIndex)<='9'){
                digitsCount++;
            }else{
                characterCount++;
            }firstIndex++;

        }while (firstIndex < string.length());
        System.out.println(letterCounter);
        System.out.println(digitsCount);
        System.out.println(characterCount);
        }
        }













