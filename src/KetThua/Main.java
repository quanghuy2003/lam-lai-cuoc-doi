package KetThua;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bankinh;
        try {
            System.out.println("nhập bán kính hình tròn");
            bankinh = scanner.nextInt();
            System.out.println("nhập màu của hình tròn");
            scanner.nextLine();
            String mautron = scanner.nextLine();
            System.out.println("nhập chiều cao hình trụ");
            int chieucao = scanner.nextInt();
            System.out.println("nhập màu hình trụ");
            scanner.nextLine();
            String mautru = scanner.nextLine();
            Circle a = new Circle(bankinh, mautron);
            System.out.println("chu vi hình tròn là " + a.Stron());
            System.out.println("màu của hình tròn là " + mautron);
            Cylinder b = new Cylinder(bankinh, mautru, chieucao);
            System.out.println("diện tích xung quanh của hình trụ là " + b.Sxungquanh());
            System.out.println("diện tích toàn phần của hình trụ là " + b.Stoanphan());
            System.out.println("màu của hình trụ là " + mautru);
        }catch (InputMismatchException e){
            System.out.println("nhập sai");
        }
    }
}
