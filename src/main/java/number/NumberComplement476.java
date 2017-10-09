package number;

/**
 * Created by fengliejv on 2017/10/10.
 */
public class NumberComplement476 {
    public int findComplement(int num)
    {
        int i = 0;
        int j = 0;

        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }

        return i - num;
    }
}
