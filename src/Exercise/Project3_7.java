package Exercise;

import static java.lang.Math.*;

public class Project3_7 {
    public static void main(String[] args) {
        int[] i = new int[10];
        int s = 0;

        for (int j = 0; j < i.length; j++) {
            i[j] = (int)(Math.random()*10 +1);
            System.out.print(i[j] +" ");
            s += i[j];
        }
        System.out.println("\n평균 : " + (double)s/10);

    }
}
