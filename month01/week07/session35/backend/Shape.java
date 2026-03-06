// // **
// //  * =====================================================
// //  *  STUDENT 6 - Exercise 2: Shape & Circle
// //  *  Topic: Inheritance, extends, super
// //  * =====================================================
// //  */

// public class Shape {

//     // TODO 1: Declare one protected field:
//     //   - color (String)


//     // TODO 2: Create a constructor that takes color.


//     // TODO 3: Create a getter for color.


//     // TODO 4: Create a method called describe() that returns:
//     //         "This shape is red"
//     //         (use the color field)

// } 
// /**
//  * =====================================================
//  *  STUDENT 6 - Circle.java
//  *  Extends Shape
//  * =====================================================
//  */

// // TODO 5: Make Circle extend Shape.

// public class Circle {

//     // TODO 6: Declare one private field:
//     //   - radius (int)


//     // TODO 7: Create a constructor that takes color and radius.
//     //         Use super() to pass color to Shape.


//     // TODO 8: Create a getter for radius.


//     // TODO 9: Override describe() to return:
//     //         "This circle is red with radius 5"
//     //         (use the color and radius fields)

// }
// /**
//  * =====================================================
//  *  STUDENT 6 - ShapeApp (Main class)
//  * =====================================================
//  */

// public class ShapeApp {

//     public static void main(String[] args) {

//         // TODO 10: Create a Shape[] array of size 2.


//         // TODO 11: Assign a Shape and a Circle to the array.
//         //          shapes[0] = new Shape("blue");
//         //          shapes[1] = new Circle("red", 5);


//         // TODO 12: Loop through the array and print describe() for each.


//         // BONUS: Add a second Circle with a different color and radius.

//     }
// }

public class Shape {
    protected String color;

    public Shape(String color){
        this.color =color;
    }

    public String getColor(){
        return color;
    }
    
    public void describe(){
        System.out.println("This shape is " + color);
    }
}


 
 