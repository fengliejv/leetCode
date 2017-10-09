package math;

/**
 * Created by fengliejv on 2017/10/10.
 */
public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        int count=0;
        int cmp=1;
        while(cmp!=0){
            if((x&cmp)!=(y&cmp))
                count++;
            cmp=cmp<<1;
        }
        return count;
    }
}
