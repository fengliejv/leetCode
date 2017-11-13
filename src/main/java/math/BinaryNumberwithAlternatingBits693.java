package math;

/**
 * Created by fengliejv on 2017/11/13.
 */
public class BinaryNumberwithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        char pre = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if(pre==str.charAt(i)){
                return false;
            }else {
                pre = str.charAt(i);
            }
        }
        return true;
    }
}
