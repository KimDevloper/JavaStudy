package ch05.Overriding.Management;

public class ManagementMain {
    public static void main(String[] args) {
        SubjectManagement sb = new SubjectManagement();
        sb.name = "김대원";
        sb.id = 20213232;
        sb.sub = "자바";
        sb.student_Info();
        sb.student_subject();

    }
}
