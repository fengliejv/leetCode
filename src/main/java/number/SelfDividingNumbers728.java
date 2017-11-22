package number;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<Integer>();

        for(int i=left; i<=right ; i++){
            if(isSelfDividingNumber(i))
                ans.add(i);
        }
        return ans;
    }


    public boolean isSelfDividingNumber(int n){
        int original = n;
        while(n>0){
            int r = n%10;
            if(r == 0)            return false;
            if(original%r !=0)   return false;
            n /= 10;
        }
        return true;
    }
}
