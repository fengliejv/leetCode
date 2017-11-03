package math;

/**
 * Created by fengliejv on 2017/11/3.
 */
public class PerfectNumber507 {
    public boolean checkPerfectNumber(int num) {
        if(num<2){
            return false;
        }
        int sum = 1;
        int begin = 2;
        int end = num/2;
        while (end>=begin){
            int res = begin*end;
            if(res==num){
                sum+=end+begin;
                end--;
                begin++;
            }else if(res>num){
                end--;
            }else {
                begin++;
            }
        }
        return num==sum;
    }
}
