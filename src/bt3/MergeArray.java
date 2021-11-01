package bt3;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int b[] = {8, 9, 10, 11, 12, 13};
        int length = a.length + b.length;
        int[] result = new int[length];
        int pos = 0;
        for (int element : a) {
            result[pos] = element;
            pos++;
        }
        for (int element : b) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
