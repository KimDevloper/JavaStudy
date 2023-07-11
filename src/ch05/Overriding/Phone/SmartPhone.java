package ch05.Overriding.Phone;

public class SmartPhone extends Phone {

    private String face;
    private String hand;
    public SmartPhone() {
      this.face = "";
      this.hand = "";
    }
    public SmartPhone(String face, String hand) {
         this.face = face;
         this.hand = hand;
    }

    public String getFace() {
        return face;
    }
    public void setFace(String face) {
        this.face = face;
    }
    public String getHand() {
        return face;
    }
    public void setHand(String hand) {
        this.hand = hand;
    }
    public String phone_comn() {
        return "영상통화";
    }
    public String message_comn() {
        return "이미지 통신";
    }

    public void showInfo() {
        System.out.println("사용자의 ID :" + getId() + "과 이름은 " + getName() + "의 지문과 페이스가 확인되었습니다. "+ phone_comn() + "와 " + message_comn() + "이 가능합니다.");
    }
}
