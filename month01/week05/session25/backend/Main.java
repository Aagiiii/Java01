
public class Main {
  public static void main(String[] args) {
    // Person p1 = new Person();
    // System.out.println(p1.getFirstName());

    // Person p2 = new Person("Jane", "James", 22);

    // System.out.println(p2.getFirstName());

    Dog d1 = new Dog("Bobi", "Mini", false);
    System.out.println(d1.getName());

    BankAccount b1 = new BankAccount("001", "Bat", 100000);
    BankAccount b2 = new BankAccount("002", "Bold");

    System.out.println("=== Initial status ====");
    b1.displayInfo();
    b2.displayInfo();

    System.out.println("\n=== Гүйлгээ ===");
    b2.deposit(50000);
    b1.withdraw(30000);
    b2.withdraw(100000);
    b1.transfer(b2, 10000);
    System.out.println();
    System.out.println("=== FINAL status ====");
    b1.displayInfo();
    b2.displayInfo();

    CircleFull c1 = new CircleFull(5, "red");
    c1.displayInfo();

    Rectangle r1 = new Rectangle(5, 3);
    r1.display();

    Product p1 = new Product("Laptop", 25000000, 5);
    p1.setDiscount(10);
    p1.display();
    p1.addStock(4);
    p1.removeStock(10);

    Employee e1 = new Employee("e001", "bat", "IT", 8000000);
    e1.display();
    e1.setDepartment("Marketing");
    e1.raiseSalary(10);
    e1.display();

  }

}
