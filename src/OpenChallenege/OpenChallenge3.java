package OpenChallenege;

import java.util.Scanner;

public class OpenChallenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int random = (int) (Math.random() * 100) + 1;
            System.out.println("수를 결정하였습니다. 맞추어보세요 :");

            while (true) {
                int s = scanner.nextInt();

                if (s < random) {
                    System.out.println("UP");
                } else if (s > random) {
                    System.out.println("DOWN");
                } else {
                    System.out.println("정답입니다!");
                    break;
                }
            }

            System.out.print("다시하시겠습니까?(y/n) : ");
            String n1 = scanner.next();
            if (n1.equalsIgnoreCase("n")) {
                System.out.println("게임을 종료합니다. 감사합니다.");
                break;
            } else if (n1.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("유효한 입력이 아닙니다. 게임을 종료합니다.");
                break;
            }
        }
    }
}