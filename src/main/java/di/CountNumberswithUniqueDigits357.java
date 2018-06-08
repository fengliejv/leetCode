package di;

/**
 * Created by fengliejv on 2018/6/8.
 */
public class CountNumberswithUniqueDigits357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0) return 1;
        if (n==1) return 10;
        int s = countNumbersWithUniqueDigits(n-1);
        int m=9;
        int d=9;
        while (n!=1) {
            m*=d;
            d--;
            n--;
        }
        return s+m;
    }
}
