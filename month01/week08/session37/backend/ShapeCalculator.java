abstract class Shape{
    protected String color;
    public Shape(String color){
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

    public void printInfo(){
        System.out.println(getClass().getName() + ", color : " + color + ", area " + area() + ", perimeter  " + perimeter());
    }
}

class Circle extends Shape {
    private double radius;
    public Circle (String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area() {
        return radius*radius*3.14;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return radius*2*3.14;
    }
}

class Rectangle extends Shape {
    private double height; double width;
    public Rectangle (String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2*(height +width);
    }
}

class Triangle extends Shape {
    private double height; double base; double hypotenuse;
    public Triangle (String color, double height, double base, double hypotenuse){
        super(color);
        this.height = height;
        this.base= base;
        this.hypotenuse = hypotenuse;
    }
    @Override
    public double area() {
        return base*0.5*height;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return (height +base +hypotenuse);
    }
}

class Square extends Shape {
    private double side;
    public Square (String color, double side){
        super(color);
        this.side = side;
    }
    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 4*side;
    }
}


public class ShapeCalculator {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 5);
        Rectangle r1 = new Rectangle("blue", 4, 6);
        Triangle t1 = new Triangle("orange", 5, 3, 4);
        Square s1 = new Square("pink", 8);

        Shape[] shapes = {c1,r1,t1,s1};
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}
