package bt3;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        System.out.println("nhập phần tử cần xóa trong mảng có các thành phần (1,2,3,4,5)");
     int n[] = {1,2,3,4,5};
     Scanner scanner = new Scanner(System.in);
     int socanxoa = scanner.nextInt();
     int vitricanxoa = viTriPhanTu(n,socanxoa);
     if (vitricanxoa==-1){
         System.out.println("phần tử không ở trong mảng");
     }else {
         n = xoaPhanTu(n,vitricanxoa);
     }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
    static int viTriPhanTu (int[] n,int phantu){
        int vitri = -1;
        for (int i = 0; i <n.length; i++) {
           if(n[i] == phantu){
               vitri =i;
           }
        }
        return vitri;
    }
     static int[] xoaPhanTu(int[] n, int vitri){
         int[] daySoMoi = new int[n.length - 1];
         for (int i = 0; i < vitri; i++){
             daySoMoi[i] = n[i];
         }
         for (int i = vitri + 1; i < n.length; i++){
             daySoMoi[i-1] = n[i];
         }
         return daySoMoi;
     }
}
