

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 5);
        Rectangle r1 = new Rectangle(" blue", 5, 2);


        // use Polymorphism to call the describe methods
        Shape[] shapes = {c1, r1};

            for (Shape shape : shapes) {
                shape.describe();
            }

       FullTimeEmployee f1 = new FullTimeEmployee("Bat", 01, 30000000);
       PartTimeEmployee p1 = new PartTimeEmployee("Dorj", 02, 0, 50000, 8);
       ContractEmployee ce1 = new ContractEmployee("Nar", 03, 0, 15000000, 0.3);

       Employee[] employees = {f1, p1, ce1};

       for (Employee employee : employees) {
        // employee.calculatePay();
        employee.printPayslip();
       }

      

    }
}
