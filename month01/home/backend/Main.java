

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("E1", 3000);

        System.out.println("Employee Bonus: " + e1.calculateBonus());

        Manager m1 = new Manager("M1", 3000);
           System.out.println("Manager Bonus: " + m1.calculateBonus());

        Circle c1 =new Circle(5);
        System.out.println("Circle area: "+ c1.area());
        Rectangle r1 = new Rectangle(5, 6);
         System.out.println("Rectangle area: "+ r1.area());

         Teacher t1 = new Teacher("Oyuna", "Math");
         t1.introduce();

         Student s1 = new Student("Anu", "Grade 11");
         s1.introduce();
    }
}
