package KetThua.geometry.oop;

public class shape {
    private String color;

    public shape() {
    }

    public shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "shape{" +
                "color = '" + color + '\'' +
                '}';
    }
}
