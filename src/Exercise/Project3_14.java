package Exercise;

import java.util.Scanner;

public class Project3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};

        while(true) {
            String name;
            System.out.print("과목이름 : ");
            name = sc.next();
            if (name.equals("그만")) {
                break;
            }
            boolean flag = false;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    int n = score[i];
                    System.out.println(course[i] + "의 점수는 " + n);
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                System.out.println("없는 과목입니다.");
            }
        }
    }
}
