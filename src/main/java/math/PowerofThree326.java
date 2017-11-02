package math;

/**
 * Created by fengliejv on 2017/11/2.
 */
public class PowerofThree326 {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);

    }
}
