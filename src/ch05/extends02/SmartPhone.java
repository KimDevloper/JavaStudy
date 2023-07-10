package ch05.extends02;
class SmartPhone extends Phone {
    String music;
    public SmartPhone(String n1,String n2, String music) {
        super(n1,n2);
        this.music = music;
    }
    public void music() {
        System.out.println( this.music + "음악을 재생합니다.");
    }
    public void Internet() {
        System.out.println("인터넷을 실행합니다. ");
    }

}
