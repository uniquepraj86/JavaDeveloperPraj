package abstraction;
import java.util.Scanner;
public abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return (length * breadth);
    }
}

class Square extends Shape{
    int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }
}

class Circle extends Shape
{
    int radius;
    Double area;
    public Circle(int radius,double area)
    {
        this.radius = radius;
        this.area = area;
    }

    @Override
    double calculateArea() {
        return (radius*radius)*Math.PI ;
    }
}
class Triangle extends Shape
{
    int base;
    int height;
    public Triangle(int base,int height)
    {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return(.5* base*height);
    }
}

class ShapeImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Rectangle");
            System.out.println("2.Square");
            System.out.println("3.Circle");
            System.out.println("4.Triangle");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Shape shape;
            switch (ch){
                case 1:
                    System.out.println("Enter length :");
                    int length = sc.nextInt();
                    System.out.println(" Enter breadth :");
                    int breadth = sc.nextInt();
                    shape = new Rectangle(length,breadth);
                    System.out.println("Area of Rectangle "+shape.calculateArea());
                    break;
                case 2:
                    System.out.println("Enter side");
                    int side = sc.nextInt();
                    shape = new Square(side);
                    System.out.println("Area of Square "+shape.calculateArea());
                    break;
                case 3:
                    System.out.println("Enter radius of the circle:");
                    int radius = sc.nextInt();
                    double area = (radius * radius) * Math.PI;
                    System.out.println("Area of the circle is ::"+area);
                    break;
                case 4:
                    System.out.println("Enter base :");
                    int base = sc.nextInt();
                    System.out.println("Enter height");
                    int height = sc.nextInt();
                    shape = new Triangle(base,height);
                    System.out.println("Area of Triangle "+shape.calculateArea());
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!!");
                    break;
            }
        }while (ch<4);

    }
}
