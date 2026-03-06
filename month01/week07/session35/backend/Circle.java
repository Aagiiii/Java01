
public class Circle extends Shape {
       private int radius;

    public Circle(String color, int radius){
        super(color);
        this.radius =radius;
    }

    public int getRadius(){
        return radius;
    }

    @Override
    public void describe() {
        System.out.println("This circle is " + color + " with " + "radius " + radius);
    }
}

