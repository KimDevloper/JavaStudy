package ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyEX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while(true) {
            try {
                System.out.println("곱하고자 하는 두 수 입력>>");
                n = sc.nextInt();
                m = sc.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다 재입력하세요.");
                sc.nextLine();
                continue;
            }
        }
        System.out.print(n + "x" + m + "=" + n * m);
        sc.close();
    }

}