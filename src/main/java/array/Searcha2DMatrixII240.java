package array;

/**
 * Created by fengliejv on 2017/12/1.
 */

public class Searcha2DMatrixII240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1) {
            return false;
        }
        int x = matrix.length;
        int y = matrix[0].length;
        for (int i = y-1; i >= 0; i--) {
            if (matrix[0][i] == target) {
                return true;
            }
            if (matrix[0][i] < target) {
                for (int j = 1; j < x; j++) {
                    if(matrix[j][i]==target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
