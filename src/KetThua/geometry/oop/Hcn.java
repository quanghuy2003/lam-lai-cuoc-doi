package KetThua.geometry.oop;

public class Hcn {
    private int dai;
    private int rong;


    public Hcn(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int dienTich() {
        return dai * rong;
    }

    public int chuVi() {
        return (dai + rong) * 2;
    }

    @Override
    public String toString() {
        return "Hcn{" +
                "dai = " + dai +
                ", rong = " + rong +
                '}';
    }
}
