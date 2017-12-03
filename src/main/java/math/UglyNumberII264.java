package math;

/**
 * Created by fengliejv on 2017/11/30.
 */

public class UglyNumberII264 {
    public int nthUglyNumber(int n) {
        if(n<1){
            return -1;
        }
        int two_index = 0;
        int three_index = 0;
        int five_index = 0;
        int[] res = new int[n];
        res[0]=1;
        for (int i = 1; i < n; i++) {
            while (res[two_index]*2<=res[i-1])
                two_index++;
            while (res[three_index]*3<=res[i-1])
                three_index++;
            while (res[five_index]*5<=res[i-1])
                five_index++;
            res[i] = Math.min(Math.min(res[two_index]*2,res[three_index]*3),res[five_index]*5);
            if(res[i]==res[two_index]*2){
                two_index++;
            }else if(res[i]==res[three_index]*3){
                three_index++;
            }else {
                five_index++;
            }
        }
        return res[n-1];
    }
}
