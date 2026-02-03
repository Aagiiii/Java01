
// import java.util.Scanner;

class Circle{
    // Scanner sc = new Scanner(System.in);
    // System.out.println(" Please enter radius:");
    double r ;
    String color ;
    double pi =3.14;

    double calculateArea(){
        return pi*r*r;
    }

     double calculateCircumference(){
        return pi*2*r;
    }

    void displayInfo(){
        System.out.println("====Circle ====");
        System.out.println("Color: " + color);
        System.out.println("R: " + r);
        System.out.println("S: " + calculateArea());
        System.out.println("P: " + calculateCircumference());
    }
}

public class CirclePractice {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.color ="red";
        c1.r= 2;
        c1.displayInfo();
        Circle c2 = new Circle();
        c2.color ="pink";
        c2.r= 4;
        c2.displayInfo();
    }
}
