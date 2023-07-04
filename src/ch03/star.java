package ch03;

import java.util.Scanner;

public class star {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("행의 갯수를 입력하시오 : ");
        int star = sc.nextInt();
        for(int i = 0; i<star; i++) {
            for(int j = 0; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
