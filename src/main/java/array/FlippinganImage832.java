package array;

/**
 * Created by fengliejv on 2018/6/4.
 */
public class FlippinganImage832 {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            int l = A[0].length;
            int n = l % 2 == 0 ? l / 2 - 1 : l / 2;
            for (int j = 0; j <= n; j++) {
                int begin = A[i][j];
                int end = A[i][A.length - j - 1];
                int a = end == 0 ? 1 : 0;
                int b = begin == 0 ? 1 : 0;
                A[i][j] = a;
                A[i][A.length - j - 1] = b;
            }
        }
        return A;
    }
}
