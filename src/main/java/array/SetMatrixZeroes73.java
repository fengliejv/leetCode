package array;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class SetMatrixZeroes73 {



    public void setZeroes1(int[][] matrix) {
        if(matrix==null){
            return;
        }
        int[][] newM = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(matrix[i][k]!=0)
                            matrix[i][k]=Integer.MIN_VALUE+1;
                    }
                    for (int k = 0; k < matrix.length; k++) {
                        if(matrix[k][j]!=0)
                            matrix[k][j]=Integer.MIN_VALUE+1;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==Integer.MIN_VALUE+1)
                    matrix[i][j]=0;
            }
        }
    }
}
