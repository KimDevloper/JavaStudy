package ch07;

import java.util.Scanner;
import java.util.*;

public class VertorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.println("양의 정수르 입력하시오(-1되면 종료)");
        int i = sc.nextInt();
        int s = 0;

        while (i != -1) {
            v.add(i);
            i = sc.nextInt();
        }

        for(int n:v){
            s += n;
        }
        double n1 = s / v.size();
        System.out.println("전체 합: "+ s);
        System.out.println("평균 " + n1);

    }
}
