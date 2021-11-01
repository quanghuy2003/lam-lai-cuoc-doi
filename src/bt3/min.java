package bt3;

public class min {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8}};
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(min>a[i][j]){
                    min=a[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
