package ch06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringMain {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("문장을 입력하세요 ");
            String query = sc.nextLine();
            if(query.equals("그만")) {
                System.out.println("종료");
                break;
            }
            String[] sArray = query.split(" ");
            System.out.println("어절 갯수 :" + sArray.length);
            /*
            StringTokenizer st = new StringTokenizer(sArray, " ");
            System.out.println(st.countTokens());
            */

        }

    }

}
