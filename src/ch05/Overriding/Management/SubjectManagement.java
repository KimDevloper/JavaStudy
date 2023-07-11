package ch05.Overriding.Management;

public class SubjectManagement extends StudentManagement {

    String sub;
    @Override
    public void student_subject() {
        System.out.println(sub);
    }
}
