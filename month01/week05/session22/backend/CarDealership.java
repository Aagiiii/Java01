class Car{
    String brand;
    String model;
    int year;
    double price;
    boolean isSold=false;
    Car(String brand, String model, int year, double price, boolean isSold){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isSold = isSold;
    }

    void displayInfo(){
        System.out.println(brand + model + "(" + year +")"+ "-" +price);
    }

    void sell(){
        isSold=true;
        System.out.println(brand + model + " is sold");
    }

    void applyDiscount(double discount){
        System.out.println(brand + model + "is discounted by " + discount + "%") ;
        System.out.println("New price: " + price*discount*0.01);
    }
}

public class CarDealership {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Crown", 2023, 450000000, false);
        Car c2 = new Car("Toyota", "Camry", 2022, 350000000, false);
        Car c3 = new Car("Toyota", "Civic", 2021, 250000000, false);

        System.out.println("==== Sale for cars====");
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();

        c1.applyDiscount(10);
        c1.sell();
    }
}
