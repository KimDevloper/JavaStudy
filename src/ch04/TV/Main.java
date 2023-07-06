package ch04.TV;

public class Main {
    public static void main(String[] args) {
        TV t1 = new TV("애플");
        TV t2 = new TV("LG",2021);
        TV t3 = new TV("삼성", 2020, 65);

       t1.show();
       t2.show();
       t3.show();
    }
}
