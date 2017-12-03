package di;

/**
 * Created by fengliejv on 2017/12/3.
 */
//todo
public class PerfectSquares279 {
    public int numSquares(int n) {
        int count =0;
        while (n!=0){
            int  val = (int) Math.sqrt(n);
            n=n-val*val;
            count++;
        }
        return count;
    }
//    private int findMax(int n){
//
//    }
}
