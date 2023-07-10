package ch05.extends02;

class Phone {
    private String n1, n2;
    public Phone(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public void calling() {
        System.out.println(this.n1 +"에게 전화를 걸었습니다.");
    }
    public void called() {
        System.out.println(this.n2 +"로부터" + this.n1 + "이 전화를 받습니다.");
    };
}
