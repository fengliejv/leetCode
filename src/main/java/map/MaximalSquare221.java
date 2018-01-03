package map;

/**
 * Created by fengliejv on 2018/1/3.
 */
public class MaximalSquare221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length==0){
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] map = new int[row][col];
        int max=0;
        for (int i = 0; i < row; i++) {
            if(matrix[i][0]=='0'){
                map[i][0]=0;
            }else {
                map[i][0]=1;
                max=1;
            }
        }
        for (int i = 0; i < col; i++) {
            if(matrix[0][i]=='0'){
                map[0][i]=0;
            }else {
                map[0][i]=1;
                max=1;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if(matrix[i][j]!='0'){
                    int val = matrix[i-1][j-1];
                    if(val=='0'){
                        map[i][j]=1;
                    }else {
                        int a = (int) Math.sqrt(map[i-1][j-1]);
                        int count =  count(a,i,j,matrix);
                        map[i][j]= (count*count);
                        if(map[i][j]>max){
                            max=map[i][j];
                        }
                    }
                }else {
                    map[i][j]=0;
                }
            }
        }
        return max;
    }
    public int count(int a,int i,int j,char[][] matrix){
        int count=1;
        for (int k = 1; k <=a ; k++) {
            if(matrix[i-k][j]=='1'&&matrix[i][j-k]=='1'){
                count++;
            }else {
                return count;
            }
        }
        return count;
    }
}
