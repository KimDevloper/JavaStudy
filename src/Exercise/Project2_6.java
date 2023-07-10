package Exercise;

import java.util.Scanner;

public class Project2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~99 사이의 정수를 입력하시오 >> ");
        int n1 = sc.nextInt();
        int s = n1%10;
        int s1 = n1/10;
        if(s == 3 || s == 6 || s == 9) {
            System.out.println("박수짝");
        }
        if((s1%3==0&& s1%6==0) || (s1%3==0 && s1%9==0) || (s1%6==0 && s1%9==0)) {
                System.out.println("박수짝짝");

        }

    }
}
