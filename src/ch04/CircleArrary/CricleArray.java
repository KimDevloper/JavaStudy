package ch04.CircleArrary;

public class CricleArray {
    public static void main(String[] args) {
        Circle [] cc = new Circle[5];

        for(int i = 0; i< cc.length; i++){
            cc[i] = new Circle(i);
        }

        for(int i = 0; i< cc.length; i++) {
            System.out.println(cc[i].get()+ " ");
        }
    }
}
