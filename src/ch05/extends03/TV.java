package ch05.extends03;

import static java.awt.Color.getColor;

public class TV {
    private int size,buyingDate;

    public TV(int size, int buyingDate) {
        this.size = size;
        this.buyingDate = buyingDate;
    }

    public TV() {

    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getBuyingDate() {
        return buyingDate;
    }
    public void setBuyingDate(int buyingDate) {
        this.buyingDate = buyingDate;
    }
    public void showInfo() {
        System.out.println(getSize()+"인치 TV를 "+getBuyingDate()+"에 구입했습니다.");
    }
}