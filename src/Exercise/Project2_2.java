package Exercise;

import java.util.Scanner;

public class Project2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2자리수(10~99) 정수 입력>>");
        int i = sc.nextInt();
        if(i%11==0) {
            System.out.println("Yes! 10의자리와 1의자리가 같습니다.");
        }
        else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
    }
} // 다음에 할 때 조건문 하나 추가해서 범위 외에 숫자를 넣으면 틀렸다는 코드를 추가하기!
