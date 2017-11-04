package math;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by fengliejv on 2017/11/4.
 */
public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder res = new StringBuilder();
        int count=0;
        while (i>=0||j>=0||count>0){
            char n1 = i>=0?num1.charAt(i):'0';
            char n2 = j>=0?num2.charAt(j):'0';
            char sum = (char) (n1+n2-'0'+count);
            count=0;
            if(sum>'9'){
                count=1;
                sum = (char) (sum-10);
            }
            res.append(sum);
            i--;
            j--;
        }
        return res.reverse().toString();
    }
}
