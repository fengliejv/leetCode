package di;

/**
 * Created by fengliejv on 2017/12/3.
 */

public class PerfectSquares279 {
    public int numSquares(int n) {
        int[] res =new int[n+1];
        res[0]=0;
        for (int j = 1; j < res.length; j++) {
            int min = Integer.MAX_VALUE;
            int i=1;
            while (j>=i*i){
                min = Math.min(res[j-i*i]+1,min);
                i++;
            }
            res[j]=min;
        }
        return res[n];
    }

}
