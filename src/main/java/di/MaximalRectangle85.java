package di;

/**
 * Created by fengliejv on 2018/6/7.
 */
//todo
public class MaximalRectangle85 {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0){
            return 0;
        }
        int max = 0;
        int[][] map = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 && j == 0) {
                        map[i][j] = 1;
                    } else if (i == 0) {
                        map[i][j] = map[i][j - 1] + 1;
                    }else if(j==0){
                        map[i][j]=map[i-1][j]+1;
                    }else {
                        if(map[i-1][j-1]!=0){
                            map[i][j] = map[i-1][j]+map[i][j-1]-map[i-1][j-1]+1;
                        }else {
                            map[i][j]=Math.max(map[i-1][j],map[i][j-1])+1;
                        }
                    }
                    max = Math.max(map[i][j],max);
                } else {
                    map[i][j] = 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximalRectangle85 maximalRectangle85 = new MaximalRectangle85();
        char[][] chars = new char[][]{
                {'1','0','1','1','0','1'},
                {'1','1','1','1','1','1'},
                {'0','1','1','0','1','1'},
                    {'1','1','1','0','1','0'},
                        {'0','1','1','1','1','1'},
                            {'1','1','0','1','1','1'}
        };
        maximalRectangle85.maximalRectangle(chars);
    }
}
