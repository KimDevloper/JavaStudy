package ch05.extends03;

public class IPTV extends ColorTV{
    private String ipAddr;

    public IPTV(int size,int buyingData, String Color, String ipAddr) {
        super(size, buyingData, Color);
        this.ipAddr = ipAddr;
    }


    public String getIpAddr() {
        return ipAddr;
    }
    public void setIpAddr(String ipAddr){
        this.ipAddr = ipAddr;
    }
    public void showInfo() {
        System.out.println("나의 IPTV는 " + getSize() + "인치, " + getColor() + "컬러, " + getIpAddr() + "주소를 가지는 TV이다.");
    }

}
