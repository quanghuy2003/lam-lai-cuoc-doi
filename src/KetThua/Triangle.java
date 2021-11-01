package KetThua;

public class Triangle extends shape {
    private double a = 1;
    private double b = 1;
    private double c = 1;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean checkTriangle() {
        boolean check1 = a + b > c;
        boolean check2 = b + c > a;
        boolean check3 = a + c > b;
        return check1 && check2 && check3;
    }

    public double getPerimeter() {
        return (a + b + c);
    }

    public double getArea() {
        if (checkTriangle()) {
            double p = 0.5 * (a + b + c);
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
            return -1;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
