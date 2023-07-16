package ch07;

import java.util.HashMap;

class Student {
    private int id;
    private int java;
    private int c;
    private int p;

    public Student(int id, int java, int c, int p) {
     this.id = id;
     this.java= java;
     this.c = c;
     this.p = p;
    }
    public int getId() {return id;}
    public int getJava(){return java;}
    public int getC(){return c;}
    public int getP(){return p;}
}

public class HashMapStudent {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        Student s1 = new Student(20213232, 70, 50, 60);
        Student s2 = new Student(20212332, 80, 20, 70);
        Student s3 = new Student(20214444, 90, 30, 90);
        Student s4 = new Student(20213323, 85, 50, 50);
        Student s5 = new Student(20213212, 95, 60, 40);

        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        map.put(s4.getId(), s4);
        map.put(s5.getId(), s5);

        for (Integer key : map.keySet()) {
            Student student = map.get(key);
            int s = student.getJava() + student.getP() + student.getC();
            double n = s / 3.0;

            System.out.println("학생 이름: " + key);
            System.out.println("점수 합계: " + s);
            System.out.println("점수 평균: " + n);
            System.out.println();
        }
    }
}


