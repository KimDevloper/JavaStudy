package ch03;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수 10개를 입력하시오. : ");
        int intArray[] = new int[10];
        for(int i = 0; i< intArray.length; i++)
        { intArray[i] = sc.nextInt();
        }
        for(int i=0; i<10;i++)
            if(intArray[i]%3==0) {
              System.out.println(intArray[i]);
            }
            else {
                continue;
            }
    }
}
