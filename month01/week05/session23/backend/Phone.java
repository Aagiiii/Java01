

public class Phone {
    // TODO: private талбарууд зарлах
    // - brand (String)
    private String brand;
    // - model (String)
    private String model;
    // - storageGB (int)
    private int storageGB;
    // - batteryPercent (int)
    private int batteryPercent;


    // TODO: Getter методууд
    public String getBrand(){
        return brand;
    }
     public String getModel(){
        return model;
    }

    public int getStorage(){
        return storageGB;
    }
    public int getBattery(){
        return batteryPercent;
    }
    // TODO: Setter методууд

public void setBrand( String brand){
    this.brand = brand;
}

public void setModel( String model){
    this.model = model;
}

public void setStorage( int strg){
    this.storageGB = strg;
}
public void setBattery( int btr){
    this.batteryPercent = btr;
}
    // TODO: charge(int percent) - цэнэглэх
    // batteryPercent 100-аас хэтрэхгүй байх

public int charge(int percent){
if (getBattery() <=100) {
   return batteryPercent= batteryPercent+percent;
} else{
    return 0;
}
}
    // TODO: useBattery(int percent) - батерей зарцуулах
    // batteryPercent 0-ээс бага болохгүй байх
public int useBattery(int percent){
    if (getBattery()>=0) {
        return batteryPercent=batteryPercent-percent;
    }else{
    return 0;
}
}

    // TODO: isLowBattery() - батерей бага эсэх (< 20)

public boolean isLowBattery(){
    if (getBattery() < 20) {
        return true;
    }else{
        return false;
    }
}
    // TODO: displayInfo() - мэдээлэл хэвлэх
    public void displayInfo(){
         System.out.println("=== Infos of Phone ===");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Storage: "+ getStorage() +"GB");
        System.out.println("BatteryPercent: " + getBattery() +"%");
       System.out.println("Use battery by 50: " + useBattery(50) +" %");
        System.out.println("BatteryPercent: " + getBattery() +"%");
         System.out.println("IsLowbattery> : " + isLowBattery());
         System.out.println("Use battery by 40: " + useBattery(40) +" %");
        System.out.println("BatteryPercent: " + getBattery() +"%");
           System.out.println("IsLowbattery> : " + isLowBattery());
    }
}
