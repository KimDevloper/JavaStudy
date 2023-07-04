package ch03;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 몸무게 입력 : ");
        int one = sc.nextInt();

        System.out.println("목표 몸무게 입력 : ");
        int two = sc.nextInt();
        int s = 1;
        while (one > two) {
            System.out.println(s + "주차 감량 몸무게 : ");
            s++;
            int tot = sc.nextInt();
            one = one - tot;
        }
        System.out.println(two + "kg 달성! 축하드립니다.");
    }
}
