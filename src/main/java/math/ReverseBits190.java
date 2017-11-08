package math;

/**
 * Created by fengliejv on 2017/11/8.
 */
public class ReverseBits190 {
    public int reverseBits2(int n) {
        StringBuilder str = new StringBuilder(Integer.toBinaryString(n)).reverse();
        return  Integer.parseUnsignedInt(str.toString());
    }
    public int reverseBits(int n) {
        if (n == 0) return 0;

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            if ((n & 1) == 1) result++;
            n >>= 1;
        }
        return result;
    }
}
