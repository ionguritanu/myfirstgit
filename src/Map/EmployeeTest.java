package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {

        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        Employee e1 = new Employee("Max", "Chicago", 21, 1);
        Employee e2 = new Employee("Alex", "Des PLaines", 44, 4);
        Employee e3 = new Employee("Davis", "Palatine", 33, 5);
        Employee e4 = new Employee("Ion", "Buffalo", 11, 6);

        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        employeeMap.put(e4.id, e4);

        System.out.println(employeeMap);
        ArrayList<String> names = new ArrayList<>(); //to store in arrayList

        for (Employee employee : employeeMap.values()){
            names.add(employee.name);
            System.out.println(employee.name);
            System.out.println(employee.city.toUpperCase());
        }
        System.out.println(names);
    }
}
