package array;

/**
 * Created by fengliejv on 2018/6/4.
 */
public class MagicSquaresInGrid840 {
    public int numMagicSquaresInside(int[][] grid) {
        if(grid.length<3||grid[0].length<3){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[0].length - 2; j++) {
                if (isOK(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;

    }

    private boolean isOK(int[][] grid, int i, int j) {
        if (!isOneToNine(grid, i, j)) {
            return false;
        }
        if (!isEqual(grid, i, j)) {
            return false;
        }
        return true;
    }

    private boolean isEqual(int[][] grid, int i, int j) {
        int sum = grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2];
        if (grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] != sum) {
            return false;
        }
        for (int k = 0; k < 3; k++) {
            if (sum != grid[i + k][j] + grid[i + k][j + 1] + grid[i + k][j + 2]) {
                return false;
            }
            if (sum != grid[i][j + k] + grid[i + 1][j + k] + grid[i + 2][j + k]) {
                return false;
            }
        }
        return true;
    }

    private boolean isOneToNine(int[][] grid, int i, int j) {
        int a = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                a = a | (1 << grid[i + k][j + l] - 1);
            }
        }
        if (a != 511) {
            return false;
        } else {
            return true;
        }
    }
}
