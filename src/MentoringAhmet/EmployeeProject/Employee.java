package MentoringAhmet.EmployeeProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;
    // constructor is way of initializing a instance variable



    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }


    public double tax() {
        if (salary <= 1000) {
            return 0.0;
        } else{
            return salary*0.03;
        }
    }

    public double bonus(){
        double extraHours = workHours-40;
        if (extraHours>0){
            return extraHours*30;
        }else{
            return 0.0;
        }
    }

    public double rise(){
        int year = 2015-hireYear;
        //LocalDate now = LocalDate
        if (year<10) {
            return salary*0.05;
        } else if (year>= 9 && year<20){
            return salary*0.1;
        }else{
            return salary*0.15;
        }

    }
public void information(Employee employee1){
    System.out.println("Name" + name);
    System.out.println("Salary" + salary);
    System.out.println("Work hours "+ workHours);
    System.out.println("Hire year " + hireYear);
    System.out.println("Tax " + tax());
    System.out.println("Bonus: " + bonus());
    System.out.println("Rise o salary " + rise());
    System.out.println("Salary with tax wnd bonus " + (salary-tax()) + bonus());
    System.out.println("Total salary with rise of salary " + (salary + rise()));

   }

}