package ch06;

class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea(int radius) {
      double result = radius * radius * 3.14;
      return result;
    }
    public boolean equals(Object obj) {
       Circle c = (Circle)obj;
       if(radius == c.radius && this.getArea(radius) == c.getArea(radius)) return true;
       else return false;
    }
}

public class CircleTest {
    public static void main(StringMain[] args) {
        Circle a = new Circle(4);
        Circle b = new Circle(5);
        Circle c = new Circle(6);

        if(c.equals(a)) {
            System.out.println("a is equal yo b");
        }
        if(c.equals(b)) {
            System.out.println("a is equal yo c");
        }
        if(c.equals(c)) {
            System.out.println("b is equal yo c");
        }

    }
}
