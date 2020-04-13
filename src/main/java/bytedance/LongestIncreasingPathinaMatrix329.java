package bytedance;

/**
 * Created by fengliejv on 2020/4/13.
 */
public class LongestIncreasingPathinaMatrix329 {
    int[][] xx = new int[][]{
            {1,0},
            {-1,0},
            {0,-1},
            {0,1}
    };

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int max = 1;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] dp = new int[matrix.length][matrix[0].length];
        init(visited,dp);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int m = dfs(i,j,matrix,visited,Integer.MIN_VALUE,dp);
                if(m>max){
                    max = m;
                }
            }
        }
        return max;
    }
    private int dfs(int i, int j, int[][] matrix, boolean[][] visited, int campare, int[][] dp) {
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length){
            return 0;
        }
        if(visited[i][j]){
            return 0;
        }
        if(matrix[i][j]>campare){
            if(dp[i][j]>0){
                return dp[i][j];
            }
            visited[i][j]=true;
            int m = 0;
            for (int k = 0; k <xx.length ; k++) {
                int mm = dfs(i+xx[k][0],j+xx[k][1],matrix,visited,matrix[i][j], dp);
                if(mm>m){
                    m=mm;
                }
            }
            dp[i][j] = m+1;
            visited[i][j]=false;
            return m+1;
        }
        return 0;

    }

    private void init(boolean[][] visited, int[][] dp) {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                visited[i][j]=false;
            }

        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }


}
