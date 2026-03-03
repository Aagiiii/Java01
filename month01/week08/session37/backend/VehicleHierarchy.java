abstract class Vehicle{
     protected String brand; String model; int year;

     public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
     }

     public abstract String fuelType();
     public abstract int maxSpeed();

     public void getInfo(){
        System.out.printf("[%d] [%s] [%s] | [%s] | max [%d] km/h", year, brand, model , fuelType(), maxSpeed());
     }

     public boolean isModern(){
        if (year >= 2020) {
            return true;
        } else{return false;}
     }
}

class PetrolCar extends Vehicle{

    public PetrolCar(String brand, String model, int year){
        super(brand, model, year);
    }
    @Override
    public String fuelType() {
        // TODO Auto-generated method stub
        return "Petrol";
    }
    @Override
    public int maxSpeed() {
        // TODO Auto-generated method stub
        return 180;
    }
}

class ElectricCar extends Vehicle{
    private double batteryKmh;

    public ElectricCar(String brand, String model, int year, double batteryKmh){
        super(brand, model, year);
        this.batteryKmh = batteryKmh;
    }
    @Override
    public String fuelType() {
        // TODO Auto-generated method stub
        return "Electric";
    }
    @Override
    public int maxSpeed() {
        // TODO Auto-generated method stub
        return 250;
    }
}

class Motorcycle extends Vehicle{

    public Motorcycle(String brand, String model, int year){
        super(brand, model, year);
    }
    @Override
    public String fuelType() {
        // TODO Auto-generated method stub
        return "Petrol";
    }
    @Override
    public int maxSpeed() {
        // TODO Auto-generated method stub
        return 220;
    }
}

class Truck extends Vehicle{
    private double payloadTons;

    public Truck(String brand, String model, int year , double payloadTons){
        super(brand, model, year);
        this.payloadTons = payloadTons;
    }
    @Override
    public String fuelType() {
        // TODO Auto-generated method stub
        return "Diesel";
    }
    @Override
    public int maxSpeed() {
        // TODO Auto-generated method stub
        return 120;
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        PetrolCar p1 = new PetrolCar("Toyoto", "Crown", 2023);
        ElectricCar e1 = new ElectricCar("J1", "007", 2025, 100);
        Motorcycle m1 = new Motorcycle("yamaha", "tenese", 2000);
        Truck t1 = new Truck("Ford", "Bronco", 2021, 3);

        Vehicle[] vehicles = {p1, e1, m1, t1};
        for (Vehicle vehicle : vehicles) {
            vehicle.getInfo();
             System.out.println();
        }
        int maxSpe = vehicles[0].maxSpeed();
        for (int i = 0; i < vehicles.length; i++) {
            
            //   vehicles[i].getInfo();
             
            if (vehicles[i].isModern()==true) {
                System.out.println(vehicles[i].brand + vehicles[i].model + " : " + vehicles[i].year );
            }

            if (maxSpe < vehicles[i].maxSpeed()) {
                maxSpe = vehicles[i].maxSpeed();
            }
           
        }
         System.out.println("MaxSpe: " + maxSpe);
       
    }
}
