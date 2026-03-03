abstract class Vehicle {
    protected String brand;
    String model;
    double fuelLevel;
    double tanksize;

    public Vehicle(String brand, String model, double fuelLevel, double tanksize) {
        this.brand = brand;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.tanksize = tanksize;
    }

    public abstract double maxSpeed();

    public abstract double fuelConsumption();

    public boolean canTravel(double km) {
        double available = fuelLevel * tanksize;
        double needed = km/fuelConsumption();
        return available >=needed;
    }

    public void describe() {
        System.out.printf("%s , %s ,%.1f : maxSpeed - %.0f km/h, fuelConsumption - %.2f km/l , canTravel: %b%n ", brand, model,
                fuelLevel, maxSpeed(), fuelConsumption(), canTravel(10));
    }
}

class Car extends Vehicle {

    public Car(String brand, String model, double fuelLevel, double tanksize) {
        super(brand, model, fuelLevel, tanksize);
    }

    @Override
    public double maxSpeed() {
        return 180;
    }

    @Override
    public double fuelConsumption() {
        return 15;
    }
}

class Truck extends Vehicle {
    public Truck(String brand, String model, double fuelLevel, double tanksize) {
        super(brand, model, fuelLevel, tanksize);
    }

    @Override
    public double maxSpeed() {
        // TODO Auto-generated method stub
        return 120;
    }

    @Override
    public double fuelConsumption() {
        // TODO Auto-generated method stub
        return 8;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, double fuelLevel, double tanksize) {
        super(brand, model, fuelLevel, tanksize);
    }

    @Override
    public double maxSpeed() {
        // TODO Auto-generated method stub
        return 220;
    }

    @Override
    public double fuelConsumption() {
        // TODO Auto-generated method stub
        return 25;
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Crown", 0.5,55);
        Truck truck1 = new Truck("Ford", "Bronco", 1,79);
        Motorcycle m1 = new Motorcycle("Yamaha", "tenere 700", 1,16);

        Vehicle[] vehicles = { car1, truck1, m1 };

        for (Vehicle vehicle : vehicles) {
            vehicle.describe();
        }
    }
}