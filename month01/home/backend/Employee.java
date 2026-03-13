

public class Employee {
    String name;
      double salary;
      public Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
      }
    public double calculateBonus(){
        return salary*0.1;
    }
}
