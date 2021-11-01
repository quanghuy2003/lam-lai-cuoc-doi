package BT2;

import java.util.Scanner;

public class display20Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số số lượng sô nguyên tố cần in ra");
//        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        for (int i = 0; count <= 20; i++) {
            if (i % n != 0) {
                System.out.println(i);
                count++;
            }
        }


    }
}
