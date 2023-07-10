package ch05.extends02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone sp = new SmartPhone();
        while (true) {
            System.out.println("1. 전화걸기 2. 전화받기 3. 음악재생 4.인터넷 중 원하는 명령어를 입력하시오.");
            String name = sc.next();
                if (name.equals("전화걸기")) {
                    sp.call();
                    break;
                } else if (name.equals("전화받기")) {
                    sp.b();
                    break;
                } else if (name.equals("음악재생")) {
                    sp.music();
                    break;
                } else if (name.equals("인터넷")) {
                    sp.Internet();
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다. 다시입력하세요.");
                    continue;
                }

        }
    }
}
