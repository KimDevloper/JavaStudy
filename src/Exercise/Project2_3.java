package Exercise;

import java.util.Scanner;

public class Project2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하시오>>");
        int i = sc.nextInt();
        int s = 0;
        if(i>=50000){
            System.out.println("오만원권" + i/50000 + "매");
            i = i%50000;
            if(i >= 10000) {
                System.out.println("만원권" + i/10000 + "매");
                i = i%10000;
                if(i >= 5000) {
                    System.out.println("천원권" + i/1000 + "매");
                    i = i%1000;
                }
            }
        }
    }
}