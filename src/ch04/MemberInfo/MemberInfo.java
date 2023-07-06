package ch04.MemberInfo;

public class MemberInfo {
    String name;
    int hi;
    int weight;

    public MemberInfo(String name, int hi, int weight) {
        this.name = name;
        this.hi = hi;
        this.weight = weight;
    }
    public void printInfo() {
        System.out.println(name + "회원님의 키는" + hi + "cm 몸무게는 " + weight + "kg입니다." );
    }

}
