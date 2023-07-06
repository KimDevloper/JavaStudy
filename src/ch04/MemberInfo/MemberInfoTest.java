package ch04.MemberInfo;

import java.util.Scanner;

public class MemberInfoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberInfo [] M = new MemberInfo[5];

        for(int i = 0; i<M.length; i++) {

            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("키 : ");
            int hi = sc.nextInt();
            System.out.println("kg :");
            int weight = sc.nextInt();
            M[i] = new MemberInfo(name, hi, weight);
        }
        for(int i = 0; i<M.length; i++) {
            M[i].printInfo();
        }

    }
}
