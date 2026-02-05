

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Java");
        b1.setAuthor("James");
        b1.setPages(450);
        b1.setPrice(40000);

        b1.displayInfo();

        Car c1 = new Car();
        c1.setBrand("Lexus");
        c1.setModel("Rx");
        c1.setYear(2015);
        c1.setCurrentSpeed(0);
        c1.displayInfo();

        Phone p1 = new Phone();
        p1.setBrand("Iphone");
        p1.setModel("17promax");
        p1.setStorage(256 );
        p1.setBattery(100);
        p1.displayInfo();
    }
}
