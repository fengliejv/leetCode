package map;

/**
 * Created by fengliejv on 2018/1/4.
 */
public class RotateImage48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix,i,j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int a = matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=a;
            }
        }
    }

    public void swap(int[][] matrix,int i ,int j){
        int c =matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=c;
    }
}
