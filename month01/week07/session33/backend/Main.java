

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2023, 4);
        Truck t1 = new Truck("Ford", 2022, 5000);

        System.out.println("Infos of the Vehicles");
        c1.displayInfo();
        t1.displayInfo();
        c1.speed();
        c1.speed(120);
        c1.speed(120, 3);
        c1.openSunroof();
        t1.loadCargo(3500);
    }
}
