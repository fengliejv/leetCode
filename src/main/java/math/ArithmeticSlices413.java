package math;

/**
 * Created by fengliejv on 2017/12/4.
 */
public class ArithmeticSlices413 {
    public int numberOfArithmeticSlices(int[] A) {
        int sum=0;
        if(A.length<3)
            return 0;
        int count =1;
        int pre = A[1]-A[0];
        for (int i = 2; i < A.length; i++) {
            int val = A[i]-A[i-1];
            if(val==pre){
                count++;
            }else {
                sum+=(count)*(count-1)/2;
                count=1;
                pre=val;
            }
        }
        sum+=(count)*(count-1)/2;
        return sum;
    }
}
