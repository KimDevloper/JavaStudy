package ch04.staticSample.StaticSm;

import java.util.Scanner;

public class StaticArray {
    public static void main(String[] args) {
        String subject[] = {"자바", "C++", "python", "Ruby", "R", "C", "Matlab"};
        Scanner sc = new Scanner(System.in);
        System.out.println("찾는 문자열? ");
        String find = sc.next();
        FindString.findstring(find, subject);
        sc.close();
    }
}
