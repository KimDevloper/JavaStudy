package Exercise;

import java.util.Scanner;

public class Project2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원화를 입력하세요 : ");
        double won = sc.nextInt();
        double da = (won / 1100);
        System.out.println(won + " 원은 $" + da +" 입니다." );
    }
}
