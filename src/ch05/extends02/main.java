package ch05.extends02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n1 : 이름입력");
        String n1 = sc.next();
        System.out.println("n2 : 이름입력");
        String n2 = sc.next();
        SmartPhone sp = new SmartPhone(n1,n2, "아이유 좋은날");
        while (true) { //swtich 문 이용하기
            System.out.println("1. 전화걸기 2. 전화받기 3. 음악재생 4.인터넷 중 원하는 명령어를 입력하시오.");
            String name = sc.next();
                if (name.equals("전화걸기")) {
                    sp.calling();
                    break;
                } else if (name.equals("전화받기")) {
                    sp.called();
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
