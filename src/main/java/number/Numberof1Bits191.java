package number;

/**
 * Created by fengliejv on 2017/10/10.
 */
public class Numberof1Bits191 {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=(n-1)&n;
            count++;
        }
        return count;
    }
}
