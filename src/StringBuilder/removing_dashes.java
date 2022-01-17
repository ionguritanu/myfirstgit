package StringBuilder;

public class removing_dashes {

  //create a methode that will take string builder as a parameter and this methode will
  // delete "dashes" from in
  //    ex: I-n-te-rv-i-ew

    StringBuilder task2 = new StringBuilder();

    public static void removing_dashes(StringBuilder builder){
        for (int i = 0; i < builder.length(); i++){
            if (builder.charAt(i)=='-'){
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I-------n-te-rv-i-ew");
        removing_dashes(stringBuilder);
    }
}
