package Exercise;

import java.util.Scanner;

public class Project2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력할 때 공백으로 구분 후 입력하시오 :  ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if((n1 <= n2 && n2 <= n3) || (n3 <= n2 && n2<= n1) ) {
            System.out.println(n2);
        }
        else if((n3 <= n2 && n1 <= n3)||(n2 <= n3 && n3 <= n1)) {
            System.out.println(n3);
        }
        else {
            System.out.println(n1);
        }

    }
}
