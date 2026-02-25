public class Circle extends Shape {
    private double radius ;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
      System.out.println("Circle has " + color + " color" + " with " + radius);
    }
}
