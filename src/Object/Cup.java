package Object;

public class Cup {

    int size;
    String color;
    boolean isClean ;

    public Cup(int size) {
        this.size = size;
    }

    public Cup(String color) {
        this.color = color;
    }

    public Cup(int size, String color, boolean isClean) {
        this.size = size;
        this.color = color;
        this.isClean = isClean;

    }

    public void usage() {
        isClean =false;
        System.out.println("Cup is not clean anymore "+ isClean);
    }

    //method override
    @Override
    protected void finalize()  {
        System.out.println("This is finalize methode");
    }

    public static void main(String[] args) {
        Cup c1 = new Cup(12, "red", true);
        Cup c2 = new Cup(12, "red", true);
        Cup c3 = new Cup(12, "red", true);
        Cup c4 = new Cup(12, "red", true);
        System.out.println(c4.isClean);
        c4.usage();
        Cup c5 = c1;
        c1 = c4;
        System.out.println();
        System.out.println(c1.isClean);
        System.out.println(c5.isClean);

        c2 = null;
        c5= c2;

        //System.out.println(c2.isClean);
        System.out.println(c2); // hashcode -- memory location

        c2 = c3; //null
        System.out.println(c2.isClean);
        c1= null;
        c1= c3;
       // System.out.println(c5.color); //.NullPointerException

        System.gc();
    }
}
