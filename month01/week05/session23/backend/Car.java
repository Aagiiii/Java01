

public class Car {

    // TODO: private талбарууд зарлах
    // - brand (String)
    private String brand;
    // - model (String)
    private String model;
    // - year (int)
    private int year;
    // - currentSpeed (int)
    private int currentSpeed;


    // TODO: Getter методууд
    public String getBrand( ){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }
    // TODO: Setter методууд

    public void setBrand( String brand){
        this.brand = brand;
    }

    public void setModel (String mdl){
        this.model = mdl;
    }

    public void setYear(int yr){
        this.year = yr;
    }

    public void setCurrentSpeed( int curSpd){
        this.currentSpeed = curSpd;
    }

    // TODO: accelerate(int amount) - хурдасгах
    // Хурд 200-аас хэтрэхгүй байх

    public int accelerate(int amount){
        if (getCurrentSpeed()<=200) {
           return currentSpeed +=amount;
        } else{
             return 0;
        }
    }

    // TODO: brake(int amount) - хурд сааруулах
    // Хурд 0-ээс бага болохгүй байх
      public int brake(int amount){
        if (getCurrentSpeed()>=0) {
           return currentSpeed -=amount;
        } else{
             return 0;
        }
    }

    // TODO: getAge() - машины нас (2025 - year)

    public int getAge(){
        return (2026-getAge());
    }
    // TODO: isMoving() - хөдөлж байгаа эсэх (currentSpeed > 0)

    public boolean isMoving(){
        if (getCurrentSpeed() > 0) {
            return true;
        } else{
            return false;
        }
    }
    // TODO: displayInfo() - мэдээлэл хэвлэх

    public void displayInfo(){
        System.out.println("=== Infos of car ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: "+ getYear());
        System.out.println("CurrentSpeed: " + getCurrentSpeed());
       System.out.println("Accelerate by 50: " + accelerate(50));
         System.out.println("CurrentSpeed: " + getCurrentSpeed());
         System.out.println("IsMoving: " + isMoving());
          System.out.println("Brake by 20: " + brake(20));
         System.out.println("CurrentSpeed: " + getCurrentSpeed());

    }
    
}
