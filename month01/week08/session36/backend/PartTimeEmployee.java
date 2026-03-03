

public class PartTimeEmployee  extends Employee{
    private double hourlyrate; double hoursWorked;
    
    public PartTimeEmployee(String name, int id, double baseSalary, double hourlyrate, double hoursWorked){
        super(name, id, baseSalary);
        this.hourlyrate = hourlyrate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyrate;
    }
}
