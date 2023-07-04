package ch03;

import java.util.Scanner;

public class xysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시작 정수 : ");
        int st = sc.nextInt();

        System.out.println("종료 정수 : ");
        int stop = sc.nextInt();
        int tot = 0;
        for(int i = st; i<= stop; i++) {
            tot = tot + i;
        }
        System.out.println("Sum" + st + " to" + stop + " =" + tot);
    }
}
