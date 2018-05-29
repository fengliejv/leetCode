package di;

/**
 * Created by fengliejv on 2018/5/29.
 */
public class CountingBit338 {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0]=0;
        for (int i = 1; i <= num; i++) {
            int flag = i&1;
            res[i]=res[i>>1]+flag;
        }
        return res;
    }
}
