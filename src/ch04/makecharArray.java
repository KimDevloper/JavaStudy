package ch04;

import java.util.Scanner;

public class makecharArray {
    static char[] makecharArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String In = sc.nextLine();
        char[] charArr = new char[In.length()];
        for(int i =0; i<In.length(); i++) {
            charArr[i] = In.charAt(i);
        }
        return charArr;
    }
    public static void main(String[] args) {
      char[] charArr = makecharArray();
      for(char c : charArr) {
          System.out.print(c +" ");
      }
    }
}
