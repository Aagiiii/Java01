public class Triangle extends Shape {
    private double height;
    private double base;
    public Triangle(String color, double height , double base){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public void printInfo() {
       System.out.println("Triangle has " + color + " color " + " with " + height + " height" + " and " + base + " base ");
    }
}
