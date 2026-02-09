/**
 * ДААЛГАВАР:
 * Circle class үүсгэж, тойргийн талбай, урт тооцоолох програм бич.
 *
 * ШААРДЛАГА:
 * 1. Circle class-д дараах field нэмэх:
 *    - radius (double) - Радиус
 *
 * 2. Дараах методууд нэмэх:
 *    - calculateArea() - талбай (π * radius * radius)
 *    - calculateCircumference() - урт (2 * π * radius)
 *    - displayInfo() - мэдээлэл хэвлэх
 *    - Ашиглах: Math.PI
 *
 * 3. 2 Circle үүсгэж талбай, урт тооцоолох
 *
 * ЖИШЭЭ ГАРАЛТ:
 * === Тойрог 1 ===
 * Радиус: 5.0
 * Талбай: 78.53981633974483
 * Урт: 31.41592653589793
 */

class Circle {
    // Field энд бичнэ үү
    double radius;
    static final double pi = 3.14;
    // calculateArea() method
    void calculateArea(){
        double area = pi*radius*radius;
        System.out.println("Area: " + area);
    }
    // calculateCircumference() method
      void calculateCircumference(){
        double circum = pi*2*radius;
        System.out.println("Circumference: " + circum);
    }
    // displayInfo() method
    void displayInfo(){
        System.out.println("Radius: "+ radius);
        calculateArea();
        calculateCircumference();
        System.out.println();
    }

}

public class Aagii {
    public static void main(String[] args) {
        // Circle үүсгэж талбай, урт тооцоолох
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle[] circles =  new Circle[2];
        circles[0]=c1;
        circles[1]=c2;
        c1.radius =5;
        c2.radius =6;

        for (int i = 0; i < circles.length; i++) {
            System.out.println("=== Circle " + (i+1) + " ====");
            circles[i].displayInfo();
        }

    }
}


