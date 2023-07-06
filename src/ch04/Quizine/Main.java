package ch04.Quizine;

public class Main {
    public static void main(String[] args) {
        Quizine s1 = new Quizine("조대벼락");
        s1.map = "광주광역시 동구 조선대 후문";
        s1.tot = 8000000;
        s1.showInfo();
        Quizine s2 = new Quizine("맘스터치","광주광역시 동구 조선대 후문 앞" );
        s2.tot = 700000000;
        s2.showInfo();
        Quizine s3 = new Quizine("조대분식","광주광역시 동구 조선대 후문 올리브영 앞", 20000000);
        s3.showInfo();
    }
}
