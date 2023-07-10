package OpenChallenege;

import java.util.Scanner;

public class OpenChallenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        System.out.println("트럼프 >> ");
        String t = sc.next();
        System.out.println("김정은 >> ");
        String k = sc.next();

        if(t.equals("가위")) {
            if(k.equals("가위")){
                System.out.print("무승부입니다 .다시 하세요");
            }
            else if (k.equals("보")) {
                System.out.print("트럼프님이 이기셨습니다. 축하드려요!");
            }
            else if (k.equals("바위")) {
                System.out.print("졌습니다. 김정은님이 이기셨습니다.");
            }
        }
        else if(t.equals("보")){
            if(k.equals("보")){
                System.out.println("무승부입니다 .다시 하세요");
            }
            else if (k.equals("가위")) {
                System.out.println("졌습니다. 김정은님이 이기셨습니다.");
            }
            else if (k.equals("바위")){
                System.out.println("트럼프님이 이기셨습니다. 축하드려요!");
            }
        }
        else if (t.equals("바위")) {
            if(k.equals("바위")){
                System.out.println("무승부입니다 .다시 하세요");
            }
            else if (k.equals("보")) {
                System.out.println("졌습니다. 김정은님이 이기셨습니다.");
            }
            else if (k.equals("가위")) {
                System.out.println("트럼프님이 이기셨습니다. 축하드려요!");
            }
        }
        else {
            System.out.println("틀린 단어입니다. 재입력하세요.");
        }
        sc.close();
    }
}
