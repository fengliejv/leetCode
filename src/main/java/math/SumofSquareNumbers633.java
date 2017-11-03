package math;

/**
 * Created by fengliejv on 2017/11/3.
 */
public class SumofSquareNumbers633 {
    public boolean judgeSquareSum(int c) {
        int end = (int) (Math.sqrt(c)+1);
        int begin = 0;
        int sum;
        while (end>=begin){
            sum = begin*begin+end*end;
            if(sum==c){
                return true;
            }else if(sum>c){
                end--;
            }else {
                begin++;
            }
        }
        return false;
    }
}
