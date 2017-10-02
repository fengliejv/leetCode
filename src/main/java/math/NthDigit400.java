package math;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class NthDigit400 {
    public int findNthDigit(int n) {
        int i = 1;
        int a = 1*9;
        while (n-a>0){
            n=n-a;
            i++;
            a= (int) (i*9*Math.pow(10,i-1));
        }

       int div = n/(i);
       int res = n%(i);
       int val = (int) (Math.pow(10,i-1)+div);
       int result = (val-1)%10;
       if(res==0){
           return result;
       }
       int bit = i-res+1;
       while (bit>0){
           result = val%10;
           val=val/10;
           bit--;
       }
        return result;
    }

}
