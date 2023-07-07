package ch04.staticSample;

class StaticEx {
    public int n;

    public void g() {
        m = 20;
    }
    public void h() {
        m = 30;
    }
    public static int m;

    public static void f() {
        m = 5;
    }
}