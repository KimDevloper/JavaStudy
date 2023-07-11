package Exercise;

import java.util.Scanner;

public class Project3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] unit = {50000, 10000, 1000, 500, 100, 10, 1};
        System.out.println("금액을 입력하시오 :" );
        int s = sc.nextInt();
        for(int i =0;i<unit.length;i++) {
            if(s>= unit[i]) {
                System.out.print( unit[i] +"개 짜리 : "+ s/unit[i]);
                s %= unit[i];
            }
            System.out.println();
        }
        sc.close();
    }
}
