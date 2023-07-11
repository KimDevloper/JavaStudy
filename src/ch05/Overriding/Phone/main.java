package ch05.Overriding.Phone;

public class main {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.setName("김대원");
        ph.setId(20233333);
        ph.showInfo();

        Phone sp = new SmartPhone();
        sp.setName("박대원");
        sp.setId(20213232);
        sp.showInfo();

    }
}
