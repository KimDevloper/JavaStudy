package ch04;

import java.util.Scanner;

public class GetMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번쨰 정수 입력 :");
        int num1 = sc.nextInt();
        System.out.print("두 번쨰 정수 입력 :");
        int num2 = sc.nextInt();

        int result = getAbsoluteValue(num1, num2);
        System.out.println("결과 확인 : "+ result);
    }
    public static int getAbsoluteValue(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
}
