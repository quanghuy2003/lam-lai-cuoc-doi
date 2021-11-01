package KetThua.geometry.oop;

import KetThua.geometry.oop.Triangle;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh a");
        double a = scanner.nextInt();
        System.out.println("nhập cạnh b");
        double b = scanner.nextInt();
        System.out.println("nhập cạnh c");
        double c = scanner.nextInt();
        Triangle triangle = new Triangle(a, b, c);
        triangle.checkTriangle();
        System.out.println("chu vi tam giác " + triangle.getPerimeter());
        System.out.println("diện tích tam giác là " + triangle.getArea());
    }
}
