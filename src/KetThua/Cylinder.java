package KetThua;

public class Cylinder extends Circle{
        private int chieucao;

    public Cylinder() {
    }

    public Cylinder(int chieucao) {
        this.chieucao = chieucao;
    }

    public Cylinder(int banKinh, String mau, int chieucao) {
        super(banKinh, mau);
        this.chieucao = chieucao;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    public int Sxungquanh(){
        return (int)(2 * Math.PI * getBanKinh() * chieucao);
    }

    public int Stoanphan(){
        return (int)(2 * Math.PI * getBanKinh() * (getBanKinh() + chieucao));
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "chieucao = " + chieucao +
                '}';
    }
}
