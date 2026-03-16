

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Motorrad m1 = new Motorrad();
        m1.printlnfo();

        Tractor t1 = new Tractor();

        t1.printlnfo();
    }
}

abstract class  Vehicle {
    // String brand;
    // String model;


    public abstract void printlnfo();
    
}
class BigVehicle{
    boolean isBig(){
        return false;
    }
}
class Motorrad extends Vehicle{
    
    @Override
    public void printlnfo() {
        System.out.println("I am Motorrad ");
    }
    
}
// class Motorrad extends BigVehicle{

// }

class Tractor extends Vehicle{
    @Override
    public void printlnfo() {
        // TODO Auto-generated method stub
         System.out.println("I am Tractor ");
    }
}