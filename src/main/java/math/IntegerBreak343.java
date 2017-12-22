package math;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class IntegerBreak343 {
    public int integerBreak(int n) {
        int max=1;
        for (int i = 2; i < n; i++) {
            int a = n/i;
            int res = n%i;
            int prod=1;
            for (int j = 0; j < res; j++) {
                prod*=(a+1);
            }
            for (int j = 0; j <i-res ; j++) {
                prod*=a;
            }
            if(prod>=max){
                max=prod;
            }else {
                break;
            }
        }
        return max;
    }
}
