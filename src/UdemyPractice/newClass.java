package UdemyPractice;

public class newClass {
    public static void main(String[] args) {
        int a = 5;// assign value to a
        int b = 9;// assign value to b
        int total = a++ + ++a + --b + ++b + b + ++a + ++b - --b + a;
        System.out.println(a); // After finding the total a = 8
        System.out.println(b); // After finding the total b = 9
        System.out.println(total); // total will be 55
        // in this task, you should only find the value of a and b in the beginning.
        // There is no test for this task.
    }
}
