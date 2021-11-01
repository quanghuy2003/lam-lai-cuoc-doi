package BT2;

public class picturePrinting {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * * * * * * * * * *");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n");
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
        }
        for (int i = 7; i >= 1; i--) {

            System.out.println();
            for (int j = 1; j <= i; j++){
                System.out.print(" *");
            }
        }
    }
}
