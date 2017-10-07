package math;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class AddDigits258 {
    public int addDigits(int num) {

        return num==0?0:(num%9==0?9:(num%9));

    }
}
