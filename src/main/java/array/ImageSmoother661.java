package array;

/**
 * Created by fengliejv on 2017/10/16.
 */
public class ImageSmoother661 {
    public int[][] imageSmoother(int[][] M) {
        if (M.length == 0) {
            return M;
        }
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                res[i][j] = getResult(i, j, M);
            }
        }
        return res;
    }

    private int getResult(int i, int j, int[][] map) {
        int sum = map[i][j];
        int count = 1;
        if (i>0){
            sum=sum+map[i-1][j];
            count++;
            if(j>0){
                sum=sum+map[i-1][j-1];
                count++;
            }
            if(j<map[0].length-1){
                sum=sum+map[i-1][j+1];
                count++;
            }
        }
        if(i<map.length-1){
            sum=sum+map[i+1][j];
            count++;
            if(j>0){
                sum=sum+map[i+1][j-1];
                count++;
            }
            if(j<map[0].length-1){
                sum=sum+map[i+1][j+1];
                count++;
            }
        }
        if(j>0){
            sum=sum+map[i][j-1];
            count++;
        }
        if(j<map[0].length-1){
            sum=sum+map[i][j+1];
            count++;
        }
        return sum / count;
    }
}
