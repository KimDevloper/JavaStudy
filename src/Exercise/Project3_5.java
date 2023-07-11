package Exercise;

import java.util.Scanner;

public class Project3_5 {
    public static void main(String[] args) {
        int[] n = new int [10];
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수 10개를 입력하시오 >> ");
        for(int i = 0; i < n.length; i ++) {
            n[i] = sc.nextInt();
        }

        for(int i = 0; i <n.length; i++){
            if (n[i]%3 == 0) {
                System.out.println(n[i]);
            }
        }
    }
}
