package OOP.Abstraction.AbstractClasses;

import com.sun.security.jgss.GSSUtil;

public abstract class Student {
    String name;
    int age;


      public Student(String name, int age){
    this.age = age;
    this.name = name;
}

    public void attend(){
    System.out.println("Student is attending to class");
}

    //abstract methode below
    abstract void watch();
      public void eat(){
          System.out.println(" Student is eating ");
      }
      abstract void sleep(int hour);


}

