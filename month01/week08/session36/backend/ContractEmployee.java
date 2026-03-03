

public class ContractEmployee extends Employee {
    private double contractAmount; double taxRate;
    
    public ContractEmployee(String name, int id, double baseSalary, double contractAmount, double taxRate){
        super(name, id, baseSalary);
        this.contractAmount = contractAmount;
        this.taxRate = taxRate;

    }

    @Override
    public double calculatePay() {
        return contractAmount * (1-taxRate);
    }
}
