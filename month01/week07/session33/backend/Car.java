

public class Car extends Vehicle {
    
    private int doors;

    public Car( String brand, int year, int doors){
        super(brand, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
         System.out.println("Car: " + brand + ", " +" year: " + year + ", " 
            + "Doors: "+ doors
         );
    }

    public void openSunroof(){
        System.out.println(brand + " of the sunroof is openning now.");
    }
}
