

public class Rectangle extends Shape {
    double height;
    double base;

    public Rectangle(double height, double base){
        this.height=height;
        this.base = base;
    }


    @Override
    public double area() {
        return height*base;
    }
}
