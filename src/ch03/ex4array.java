package ch03;

public class ex4array {
    public static void main(String[] args) {
        int one[][] = new int[4][];
       int s = 0;
       one[0] = new int[4];
       one[1] = new int[1];
       one[2] = new int[1];
       one[3] = new int[4];

        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[i].length; j++) {
                s++;
                one[i][j]= s -1;
                System.out.print(one[i][j] + " ");
            }
            System.out.println();
        }
    }
}
