package ch05.extends03;

public class ColorTV extends TV {
    private String Color;
    public ColorTV() {

    }
    public ColorTV(int size, int buyingData, String Color) {
        super(size, buyingData);
        this.Color = Color;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
}
