package ch04.Students;

public class Students {
    int num;
    String name;
    int ko;
    int en;
    int math;
    int age;


    public Students(String na) {
        name = na;
    }
    public Students(int n, String na) {
        num = n;
        name = na;
    }
    public Students(String na, int n, int ae){
        num = n;
        name = na;
        age = ae;
    }
    public void ShowStdInfo() {
        System.out.println("이름: " + num + "나이: " + age + "학번 : " + num );
    }

    public int tot() {
        return en + math + ko;
    }
}
