package ch04.TV;

public class TV {
    String brand;
    int make;
    int inz;

    public TV(String brand) {
        this(brand, 2023, 32);
    }
    public  TV(String brand, int make) {
        this(brand, make, 65);
    }
    public  TV(String brand, int make,int inz) {
        this.brand = brand;
        this.make = make;
        this.inz = inz;
    }

    public void show() {
        System.out.println(brand + "에서 만든 " + make +"년형 " + inz +"인치 TV");
    }
}
