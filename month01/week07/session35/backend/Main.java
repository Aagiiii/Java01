

public class Main {
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape("blue");
        shapes[1] = new Circle("red", 5);
        // bonus
         shapes[2] = new Circle("orange", 3);
         
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].describe();
        }
       

    }
}
