

public abstract class Employee {
    protected String name; int id; double baseSalary;
    public Employee(String name, int id , double baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculatePay();

    public void printPayslip(){
        System.out.printf( "%s: %d %.2f%n" ,name , id ,calculatePay());
    };
}


