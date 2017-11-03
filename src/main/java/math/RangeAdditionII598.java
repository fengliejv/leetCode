package math;

/**
 * Created by fengliejv on 2017/11/3.
 */
public class RangeAdditionII598 {
    public int maxCount(int m, int n, int[][] ops) {
        int row = m;
        int col = n;
        for (int i = 0; i < ops.length; i++) {
            row = Math.min(row,ops[i][0]);
            col = Math.min(col,ops[i][1]);
        }
        return row*col;
    }
}
