package array;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        boolean col = false;
        boolean row = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if(i==0&&j==0){
                        row=true;
                        col=true;
                    }else if (i == 0) {
                        row = true;
                    } else if (j == 0) {
                        col = true;
                    } else {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(row){
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i]=0;
            }
        }
        if(col){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
    }



    public void setZeroes1(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int[][] newM = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (matrix[i][k] != 0)
                            matrix[i][k] = Integer.MIN_VALUE + 1;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] != 0)
                            matrix[k][j] = Integer.MIN_VALUE + 1;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == Integer.MIN_VALUE + 1)
                    matrix[i][j] = 0;
            }
        }
    }
}
