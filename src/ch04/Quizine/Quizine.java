package ch04.Quizine;

public class Quizine {
    String map;
    String name;
    int tot;

    public Quizine(String n) {
        name = n;
    }
    public Quizine(String m, String n) {
        map = m;
        name = n;
    }

    public Quizine(String m, String n, int t) {
        map = m;
        name = n;
        tot = t;
    }

    public void showInfo() {
        System.out.println("식당이름 :" + name +", 위치 : " + map+  ", 매출액 : " + tot );
    }

}
