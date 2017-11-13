package math;

/**
 * Created by fengliejv on 2017/11/9.
 */
public class SumofTwoIntegers371 {
    public int getSum(int a, int b) {
        if(b==0){
            return a;
        }
        int sum,carry;
        sum = a^b;
        carry=(a&b)<<1;
        return getSum(sum,carry);

    }
}
