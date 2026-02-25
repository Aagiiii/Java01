
// // Дасгал 2: Тээврийн Хэрэгсэл (Vehicle System)
// Даалгаврын тайлбар
// Тээврийн хэрэгслийн систем бүтээнэ. Vehicle үндсэн класс, Car болон Truck хүүхэд классуудтай. Конструкторын гинж (constructor chaining), метод дарах, метод хэт ачаалах ашиглана.
// Шаардлага

// Vehicle класс: brand, year талбарууд, 2 конструктор (1 болон 2 параметртэй), displayInfo() метод, болон speed() методыг хэт ачаалах.
// Car класс: Vehicle-аас удамшиж, doors нэмэлт талбартай. displayInfo() дарна. openSunroof() метод нэмнэ.
// Truck класс: Vehicle-аас удамшиж, loadCapacity нэмэлт талбартай. displayInfo() дарна. loadCargo() метод нэмнэ.

// Хүлээгдэж буй гаралт (Expected Output)
// === Тээврийн Хэрэгсэл ===
// Машин: Toyota, Он: 2023, Хаалга: 4
// Ачааны машин: Ford, Он: 2022, Даац: 5000.0 кг
// Toyota хурд: тодорхойгүй
// Toyota хурд: 120 км/ц
// Toyota хурд: 120 км/ц, 3-р түлхүүр
// Toyota нарны бүрээс нээж байна!
// Ford 3500.0 кг ачаа ачиж байна.

public class Vehicle {
   protected String brand;
   protected int year;
    // double speed;

    public Vehicle(String brand, int year){
        this.brand= brand;
        this.year = year;
    }
    
     public Vehicle(String brand){
       this.brand = brand;
       this.year = 2026;
     }


    public void displayInfo(){
        System.out.println("Car: " + brand + "year: " + year);
    }

    public void speed(){
        System.out.println(brand + " of the speed is uncertain.");
    }

    public void speed(double speed){
        System.out.println("The speed of " + brand + " is " +speed + "km/h");
    }
    
     public void speed(double speed, int gear){
        System.out.println("The speed of " + brand + " is " +speed + "km/h" +", " + gear + "'s gear" );
    }
}
