package ch05.Interfacae;

import java.util.Scanner;

interface CircleInterface {
    final double PI = 3.14;
    double one();
}
class Circle implements CircleInterface{
    public int half;
    public double sum; //return 값을 받아서 굳이 할 필요없다.
    public Circle(){
    }
    @Override
    public double one() {
        sum = (this.half * this.half) * PI;
        return sum;
    }

    public void show(){
        System.out.println("반지름" + half + "인 원의 넓이는 " + sum +"입니다.");
    }

}
public class InterfaceEx {
    public static void main(String[] args) {
      Circle CI = new Circle();
      Scanner sc = new Scanner(System.in);
      System.out.print("반지름을 입력하시오: ");
      CI.half= sc.nextInt();
      CI.one();
      CI.show();
    }
}
