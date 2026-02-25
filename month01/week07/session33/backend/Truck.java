

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String brand, int year, double loadCapacity){
        super(brand, year);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public void displayInfo() {
       System.out.println("Truck: " + brand + ", " +"year: " + year + ", " 
            + "loadCapacity: "+ loadCapacity + " kg"
         );
    }

    public void loadCargo(double load){
        System.out.println(brand + " " +load + " kg " + " is loading");
    }
}
