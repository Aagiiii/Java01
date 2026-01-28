

public class Example01 {
    public static void main(String[] args) {
        printHello();
        printHello();
        printHello();
        greet("Aagii");
        greet("JENNY");
        greet("ELON");

        printLine(5);
        System.out.println("===========");
        printLine(3);
        
    }
    public static void printHello(){
        System.out.println("hello");
    }
    public static void greet(String name){
        System.out.println("Hello " + name + "!");
    }

    public static void printLine(int count){
        for (int i = 0; i < count; i++) {
           System.out.print("-"); 
        }
        System.out.println();
    }
}
