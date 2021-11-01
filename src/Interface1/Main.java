package Interface1;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println( circle.getRadius());
        circle.setRadius(2);
        circle.resize(3);
        System.out.println(circle.getRadius());


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getPerimeter());
        rectangle.setWidth(3);
        rectangle.resize(4);
        System.out.println(rectangle.getPerimeter());
    }
}
