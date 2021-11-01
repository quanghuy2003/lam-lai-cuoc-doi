package bt3;

public class Array {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                sum = sum + a[i][j];
//            }
//        }
//        System.out.println(sum);


        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            if(max<a[i][j]){
                max=a[i][j];
            }
            }
            System.out.println(max);
        }
    }
}
