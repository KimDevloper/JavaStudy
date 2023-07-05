package ch04;

public class MethodArrayEx1 {
    public static void main(String[] args){
        int intArray[][];
        int sum = 0;
        intArray = makeIrregularArray();
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                sum += intArray[i][j];
            }
            System.out.println(i + " 행 원소의 합 " + sum);
            sum = 0;
        }
    }
    public static int[][] makeIrregularArray() {
        int temp[][] = new int[3][];
        temp[0] = new int[3];
        temp[1] = new int[1];
        temp[2] = new int[3];

        int s = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j]= s++;
            }
        }
        return temp;

    }
}
