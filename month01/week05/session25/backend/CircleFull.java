public class CircleFull {
    // TODO: private fields + static final PI
    private double radius;
    private String color;
    public static final double pi = 3.14;

    // TODO: Constructor
    public CircleFull(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // TODO: Getters and Setters
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public void setColor(String c) {
        this.color = c;
    }

    // TODO: calculateArea()

    public void calculateArea() {
        double s = radius * radius * pi;
        System.out.println("Area: " + s);
    }

    // TODO: calculateCircumference()
    public void calculateCircumference() {
        double c = radius * 2 * pi;
        System.out.println("Circumference: " + c);
    }

    // TODO: display()
    public void displayInfo() {
        System.out.println("=== Circle ====");
        System.out.println("Color: " + getColor());
        System.out.println("Radius: " + getRadius());
        calculateArea();
        calculateCircumference();
    }
}
