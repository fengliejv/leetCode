package math;

/**
 * Created by fengliejv on 2017/10/19.
 */
public class ArrangingCoins441 {
    public int arrangeCoins(int n) {
        if(n==0){
            return 0;
        }
        int count=1;
        while (n>0){
            n=n-count++;
        }
        count--;
        if(n!=0){
            count--;
        }
        return count;
    }
}
