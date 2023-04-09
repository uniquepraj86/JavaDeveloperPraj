package aaBasic20programs;



public class AreaOverriding {
    double area() {
        return area();
    }

}

class Cir extends AreaOverriding {
    int r = 5;

    double area() {
        return 3.14 * r * r;
    }
}

class Rect extends AreaOverriding {
    int l = 5;
    int w = 3;

    double area() {
        return l * w;
    }

}

class Squ extends AreaOverriding {
    int a = 4;

    double area() {
        return a * a;
    }
}

class Tri extends AreaOverriding {
    int h = 6;
    int b = 5;

    double area() {
        return (h * b) / 2;
    }
}

class AreaOverridingImpl {
    public static void main(String[] args) {
        AreaOverriding areaOverriding;
        System.out.println("-*-*-*-Area-*-*-*-");
        areaOverriding = new Cir();
        System.out.println("Area of Circle is " + areaOverriding.area());
        areaOverriding = new Rect();
        System.out.println("Area of Rectangle is " + areaOverriding.area());
        areaOverriding = new Squ();
        System.out.println("Area of Square is " + areaOverriding.area());
        areaOverriding = new Tri();
        System.out.println("Area of Triangle is " + areaOverriding.area());
    }
}

