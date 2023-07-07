package ch04.staticSample;

public class StaEx {

            public static void main(String[] args) {
                StaticEx s1, s2;
                s1 = new StaticEx();
                s1.n = 5;
                s1.g();
                s1.m = 50;
                s2 = new StaticEx();
                s2.n = 8;
                s2.h();
                s2.f();
                System.out.println(s1.m);

            }
        }

