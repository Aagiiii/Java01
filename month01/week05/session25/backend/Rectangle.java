public class Rectangle {
    // TODO: private fields
    private int width;
    private int height;

    // TODO: Constructor

    public Rectangle (int w , int h){
        width =w;
        height =h;
    }

    // TODO: Getters
public int getWidth(){
    return width;
}

public int getHeight(){
    return height;
}

    // TODO: calculateArea()
public double calculateArea(){
    return width *height;
}
    // TODO: calculatePerimeter()
public double calculatePerimeter(){
    return 2*(width+height);
}

    // TODO: isSquare()

    public boolean isSquare(){
        if (width == height) {
            return true;
        } else{
            return false;
        }
    }

    // TODO: display()

    public void display(){
        System.out.println("===Rectangle ====");
        System.out.println("Size is " + height + "x" + width );
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimetr: " + calculatePerimeter());
        System.out.println("IsSquare: " + isSquare());
    }
}
