package Exercise;

import java.util.Scanner;

public class Project3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("소문자 알파벳 하나를 입력하시오 >> ");
        String s = sc.next();
        char e = s.charAt(0);
        /*
        char[][] c = new char[e][];
        for(int i = 0; i < c.length;i++) {
            for(int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
        */
        //System.out.println(e);
        for(int i = (int)e; i>= 97; i-- ){
            for(int j = 97; j <= i; j++){
                System.out.print(((char)j));
            }
            System.out.println();
        }
    }
}
