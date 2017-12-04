package array;

/**
 * Created by fengliejv on 2017/12/3.
 */
public class Searcha2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0){
            return false;
        }
        int x = matrix.length;
        int y = matrix[0].length;
        for (int i = 0; i < x-1; i++) {
            if(matrix[i][0]==target){
                return true;
            }
            if(matrix[i+1][0]>target){
                for (int j = 0; j < y; j++) {
                    if(matrix[i][j]==target){
                        return true;
                    }
                }
                return false;
            }
        }
        for (int j = 0; j < y; j++) {
            if(matrix[x-1][j]==target){
                return true;
            }
        }
        return false;

    }
}
