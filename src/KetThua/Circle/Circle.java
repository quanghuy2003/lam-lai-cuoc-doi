package KetThua.Circle;

public class Circle {
    private int banKinh;
    private String mau;


    public Circle() {
    }

    public Circle(int banKinh, String mau) {
        this.banKinh = banKinh;
        this.mau = mau;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int Stron() {
        return (int) (Math.PI * banKinh * banKinh);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh = " + banKinh +
                ", mau = '" + mau + '\'' +
                '}';
    }
}
