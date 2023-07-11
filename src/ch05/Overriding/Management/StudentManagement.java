package ch05.Overriding.Management;

abstract class StudentManagement extends ScoreManagement {
    String name;
    int id;
    @Override
    public void student_Info(){
        System.out.println(this.name + this.id);
    };
}
