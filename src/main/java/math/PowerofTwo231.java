package math;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class PowerofTwo231 {
    public boolean isPowerOfTwo(int n) {

        if(n<1){
            return false;
        }
        String b = Integer.toBinaryString(n);
        int count =0;
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i)=='1'){
                count++;
                if(count>1){
                    return false;
                }
            }
        }

        return true;
    }

}
