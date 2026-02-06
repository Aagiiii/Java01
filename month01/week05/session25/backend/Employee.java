public class Employee {
    // TODO: private fields + static final TAX_RATE
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    static final double TAX_RATE = 0.10;

    // TODO: Constructor 1 (all params)
    public Employee(String id, String name, String dpr, double salary) {
        employeeId = id;
        this.name = name;
        department = dpr;
        this.salary = salary;
    }

    // TODO: Constructor 2 (default salary)
    public Employee(String id, String name, String dpr) {
        employeeId = id;
        this.name = name;
        department = dpr;
        this.salary = 500000;
    }

    // TODO: Getters
    public String getId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDpr() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // TODO: setDepartment(String dept)

    public void setDepartment(String dept) {
        this.department = dept;
    }

    // TODO: raiseSalary(double percent)

    public void raiseSalary(double percent) {
        salary = salary + salary * percent / 100;
        System.out.println("Salary is increased by" + percent);
    }

    // TODO: getTaxAmount()
    public double getTaxAmount() {
        return TAX_RATE*salary;
    }

    // TODO: getNetSalary()
    public double getNetSalary(){
        return salary - getTaxAmount();
    }

    // TODO: display()

    public void display(){
        System.out.println();
        System.out.println("ID: " + getId());
        System.out.println("NAME: "+ getName());
        System.out.println("Dept: " + getDpr());
        System.out.println("Salary: " + getSalary());
        System.out.println("Tax: " + getTaxAmount() );
        System.out.println("Net Salary: " + getNetSalary());
    }

}
