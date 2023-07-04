package ch03;

import java.util.Scanner;

public class ex3array {
    public static void main(String[] args) {
        int one[][]= new int[4][4];
        int s = 0;
        for(int i = 0; i< one.length; i++){
            for(int j = 0; j<one[i].length; j++) {
                s++;
                one[i][j]= s;
            }
         }
        /*
       int one[][] = { {1 , 2, 3, 4},
               {5, 6, 7, 8},
               {9, 10, 11, 12},
               {13, 14, 15, 16}};
          */
        for(int i = 0; i< one.length; i++){
            for(int j = 0; j<one[i].length; j++) {
                if(i==j)
                System.out.print(one[i][j]+" ");
            }
       }
    }
}
