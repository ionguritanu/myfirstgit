package Object;

public class Employee_Constructor {

    String companyName;
    int age;
    int id;
    double budgetOfCompany;

    public void setBudgetOfCompany(double expences) {
        budgetOfCompany -= expences;
        System.out.println("the budget is now " + budgetOfCompany);
    }

    public Employee_Constructor() {

    }

    public Employee_Constructor(int id) {

    }

    public Employee_Constructor(String name, int id) {

    }

    public Employee_Constructor(String name, String companyName) {

    }

    public Employee_Constructor(double budgetOfCompany) {
        this.budgetOfCompany = budgetOfCompany;
    }

    public double getBudgetOfCompany() {
        return budgetOfCompany;
    }

    public static void main(String[] args) {

        Employee_Constructor e1 = new Employee_Constructor("Zack","34");
       // e1.updateCompanyBudget( );


        //if you want to create an object with no argument?
        //you can't do it

    }
}