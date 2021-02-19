// 4.1 BaseShape2D - abstract

// Write abstract class that contains common methods and
// member values for a two dimensional (2D) shapes[*].
// Implement two real shapes based on this abstract class
// and use those objects in a program.

// Implement classes that defined shaped based on the
// ABC (Abstract Base Class):

//     abstract BaseShape2D
//     - height - public
//     - length - public
//     - area() - public, returns area of a shape

//   BaseShape2D
//            |
//     +------+--------+
//     |               |
//     class           class
//     Rectangle       Square

// Write Program.java that uses Rectangle and Square classes and
// displays to the screen calculated areas for those objects.

//     // Something like this in main()

//     Rectangle rect = new Rectangle(2, 5);
//     Square square = new Square(2);

//     ...println(  ... rect.area() ...)
//     ...println(  ... square.area() ...)

// [*] In reality, there are many more 2D shapes, like triangles
// and ellipsoids where information about LENGTH and HEIGHT would
// not be enough. There cannot be generic 2D abstract class that
// could possible accomodate all of these. In this exercise, we
// concentra on *undertanding* the use of ABSTRACT and do not try
// to model the real world.

public class Program {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 5);
        Square square = new Square(2);

        System.out.println(rect.area());
        System.out.println(square.area());
    }
}
