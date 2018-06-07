package di;

/**
 * Created by fengliejv on 2018/6/7.
 */
public class UniquePathsII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length < 1) {
            return 1;
        }
        int[][] map = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(obstacleGrid[i][j]==1){
                    map[i][j]=0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    map[i][j] = 1;
                } else if (i > 0 && j > 0) {
                    map[i][j] = map[i - 1][j] + map[i][j - 1];
                } else if (i == 0) {
                    map[i][j] = map[i][j - 1];
                } else if (j == 0) {
                    map[i][j] = map[i - 1][j];
                }
            }
        }
        return map[map.length - 1][map[0].length - 1];
    }
}
