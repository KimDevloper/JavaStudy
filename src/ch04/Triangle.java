package ch04;

import java.util.Scanner;

public class Triangle {
        int under;
        int hg;

        public int getTriangle() {
            int sum =  (hg * under) / 2;
            return sum;
        }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("높이를 입력하시오");
        tri.hg = sc.nextInt();
        System.out.println("밑면을 입력하시오");
        tri.under = sc.nextInt();

        System.out.println("넓이" + tri.getTriangle() );
    }
}
