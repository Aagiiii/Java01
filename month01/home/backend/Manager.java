

public class Manager extends Employee {
  
    public Manager( String name, double salary){
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        // TODO Auto-generated method stub
        return super.calculateBonus()*4;
    }
}
