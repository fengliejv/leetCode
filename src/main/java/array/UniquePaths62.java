package array;

/**
 * Created by fengliejv on 2017/11/29.
 */
//using dp to solve the problem
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int[][] gird = new int[m][n];
        for (int i = 0; i < m; i++) {
            gird[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            gird[0][i]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                gird[i][j]=gird[i-1][j]+gird[i][j-1];
            }
        }
        return gird[m-1][n-1];
    }
}
