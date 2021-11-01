package KetThua.geometry.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        int dai = scanner.nextInt();
        System.out.println("nhập chiều rộng");
        int rong = scanner.nextInt();
        Hcn hcn = new Hcn(dai, rong);
        System.out.println("chiều dài hình chữ nhật là " + dai + " chiều rộng hình chữ nhật là " + rong);
        System.out.println("chu vi hình chữ nhật là " + hcn.chuVi());
        System.out.println("diện tích hình chữ nhật là " + hcn.dienTich());
    }
}
