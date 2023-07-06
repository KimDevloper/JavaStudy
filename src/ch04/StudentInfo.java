package ch04;

import java.util.Scanner;

public class StudentInfo {
    String name;
    String so;
    int javagrade;
    int cgrade;
    int pyngrade;
    public int tot() {
        int sum =  javagrade + cgrade + pyngrade;
        return sum;
    }
    public int middle() {
        int sum = (javagrade + cgrade + pyngrade) / 3;
        return sum;
    }

    public static void main(String[] args) {
        StudentInfo st = new StudentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하시오 : ");
        st.name = sc.next();
        System.out.println("전공을 입력하시오 : ");
        st.so = sc.next();
        System.out.println("c언어 점수를 입력하시오 : ");
        st.cgrade = sc.nextInt();
        System.out.println("자바점수을 입력하시오 : ");
        st.javagrade = sc.nextInt();
        System.out.println("파이썬점수를 입력하시오 : ");
        st.pyngrade = sc.nextInt();

        System.out.println("총점 : " + st.tot() + "평균 : " + st.middle());

    }
}
