

public class Circle extends Shape {
    private double radius;
    double pi =3.14;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }
    @Override
    public double perimeter() {
       return radius*pi*2;
    }
}
