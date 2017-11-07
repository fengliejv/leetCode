package math;

/**
 * Created by fengliejv on 2017/11/7.
 */
public class PowerofFour342 {
    public boolean isPowerOfFour2(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;

    }
    public boolean isPowerOfFour(int num) {
        if (num < 0) {
            return false;
        }
        String str = Integer.toBinaryString(num);
        if (str.charAt(0) != '1') {
            return false;
        }
        if (str.indexOf("1", 1) > 0) {
            return false;
        }

        int lenth = str.length() - 1;
        return lenth % 2 == 0;

    }

}
