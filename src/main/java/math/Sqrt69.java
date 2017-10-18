package math;

import java.math.BigInteger;

/**
 * Created by fengliejv on 2017/9/22.
 */

public class Sqrt69 {
//    public int mySqrt(int x){
//        return (int) Math.sqrt(x);
//    }

    int object = 0;
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        this.object = x;
        return  this.find(1,x);

    }

    private int find(int start,int end){
        int mid = start + (end - start)/2;;
        //System.out.println(mid);
        int x = object/mid;
        if(x==mid){
            return x;
        }
        if(x==mid||x==mid-1||x==mid+1){
            return x>mid?mid:x;
        }
        if(x>mid){
            return find(mid,end);
        }else {
            return find(start,mid);
        }
    }
}




//public int mySqrt(int x) {
//    BigInteger bigInteger = new BigInteger(string.valueOf((long)(x)));
//    bigInteger = bigInteger.multiply(bigInteger);
//
//    return bigInteger.intValue();
//}