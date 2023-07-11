package ch05.Overriding.Phone;

class Phone {
  private int id;
  private String name;

  public Phone() {

  }
  public Phone(String name, int id) {
      this.id = id;
      this.name = name;
  }
  public int getId() {
      return id;
  }
  public void setId(int id) {
      this.id = id;
  }
  public void setName(String name) {
        this.name = name;
  }
  public String getName() {
        return name;
  }

  public String phone_comn() {
      return "음성통화";
  }

  public String message_comn() {
      return "텍스트통신";
  }

  public void showInfo() {
      System.out.println("사용자의 ID :" + getId() + "과 이름은 " + getName() + " 확인되었습니다. "+ phone_comn() +"와 "+message_comn()+"이 가능합니다.");
  }
}
