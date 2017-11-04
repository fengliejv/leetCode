package math;

/**
 * Created by fengliejv on 2017/11/3.
 */

public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {
        return n==0?0:n/5+trailingZeroes(n/5);
    }
}
