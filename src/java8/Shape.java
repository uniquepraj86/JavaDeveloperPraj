package java8;

import java.util.List;
@FunctionalInterface
public interface Shape {

 void calculateArea(int radius);
// void  calculatePerimetre();



}


class ShapeImpl{
    public static void main(String[] args) {
        Shape circleArea =(radius)-> {
            Double area = 2*3.14*radius*radius;
            System.out.println("in circle : "+area);
        };

        circleArea.calculateArea(5);

    }
}