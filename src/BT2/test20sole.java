package BT2;

import java.util.Scanner;

public class test20sole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số số lượng số lẻ  cần in ra");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        for (int i = 0; i < 2*number; i++) {
            if (i % n != 0) {
                System.out.println(i);
            }
        }
        System.out.println(count);

    }
}
