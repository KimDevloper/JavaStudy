package ch04;

public class CircleEx1 {
    int radius;
    String name;
    public CircleEx1() {
        radius = 1;
        name = "";
    }
    public CircleEx1(int r, String n) {
        radius = r;
        name = n;
    }
    public double getArea() {
        return 3.14 *radius *radius;
    }
    public static void main(String[] args)  {
        CircleEx1 pizza = new CircleEx1(10, "도넛피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" + area);
        CircleEx1 donut = new CircleEx1();
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은" + area);

    }
}
