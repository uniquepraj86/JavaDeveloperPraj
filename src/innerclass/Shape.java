package innerclass;

/**
 * Static inner class...............
 *
 */
public class Shape {
    String shapeName;
    static  class  Circle{
        String radius;
    }
}
class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape .shapeName = "Circle";
        Shape.Circle circle =new Shape.Circle();
//       circle.radius=8;
    }
}