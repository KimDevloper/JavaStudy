package ch04;

import java.util.Scanner;

public class MethodEX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번쨰 정수 입력 :");
        int num1 = sc.nextInt();
        System.out.print("두 번쨰 정수 입력 :");
        int num2 = sc.nextInt();
        boolean divisor = isDivisor(num1, num2);

        System.out.println(divisor);

    }
    public static boolean isDivisor(int num1, int num2) {
        if(num2 % num1 == 0)
            return true;
        else
            return false;
    }
}
