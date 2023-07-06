package ch04.Students;

import java.util.Scanner;

public class Student {
    public static void main (String[] args) {
        Students sa = new Students("김대원");
        Students s2 = new Students("김대원", 20213232, 23);
        Students s1 = new Students(20213232, "김대원");
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("이름 : ");
        sa.name = sc.next();
        System.out.println("학번 : ");
        sa.num = sc.nextInt();
        System.out.println("나이 : ");
        sa.age = sc.nextInt();

        System.out.println("국어 점수 : ");
        sa.ko = sc.nextInt();
        System.out.println("영어 점수: ");
        sa.en = sc.nextInt();
        System.out.println("수학 점수 : ");
        sa.math = sc.nextInt();*/

        System.out.println("이름 : " + sa.name + "학번 : " +sa.num + "점수 총합 :" + sa.tot() );


    }
}
