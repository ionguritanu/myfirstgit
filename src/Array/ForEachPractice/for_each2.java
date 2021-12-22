package Array.ForEachPractice;

public class for_each2 {
    public static void main(String[] args) {
        char [] chs = {'A', '4', '&','z', '3', 'u', '*'};

// by suing the foreach loop


        for (char b  : chs){

            if ( b >= 'a' &&  b <= 'z' || b>= 'A' && b <= 'Z'){
                System.out.println(b);
            }
        }

////////========================

        for(char letter : chs){
            if (Character.isAlphabetic(letter)){
                System.out.println(letter);
            }else if(Character.isDigit(letter)){
                System.out.println("This is a digit ->" + letter);
            }else{
                System.out.println("This is some symbol ->" + letter);
            }
        }

    }
}
