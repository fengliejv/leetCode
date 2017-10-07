package math;

import java.util.HashSet;

/**
 * Created by fengliejv on 2017/10/4.
 */
public class HappyNumber202 {
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }
        if(n<2){
            return true;
        }
        HashSet set = new HashSet();
        while (set.add(n)){
            int res;
            int sum=0;
            while (n!=0){
                res = n%10;
                n=n/10;
                sum = sum+res*res;
            }
            if(sum==1){
                return true;
            }else {
                n=sum;
            }

        }
        return false;
    }
}
