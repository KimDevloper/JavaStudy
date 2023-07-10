package Exercise;


public class Project3_1 {
    public static void main(String[] args) {

     int sum = 0, i = 0;
      /*while (i <100) {
          sum += i;
          i += 2;
      }*/
        // 2 4 6부터 98까지 더하는 while 문
        /*
        int sum = 0;
        for(int i = 0; i < 100 ; i ++) {
            sum = sum + i;
            i = i + 1;
        }*/
        do {
            sum += i;
            i += 2;
        }while(i <100);

        System.out.println(sum);
    }

}
