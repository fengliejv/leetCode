package searchandsort;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }

        return isPerfectSquare(0, num, num);

    }

    private boolean isPerfectSquare(int begin, int end, int obj) {
        int mid = (begin + end) / 2;
        int div = obj/mid;
        if (div == mid && obj % mid == 0) {
            return true;
        }
        if (mid == begin) {
            return false;
        }
        if(div>mid){
            return isPerfectSquare(mid,end,obj);
        }else {
            return isPerfectSquare(begin,mid,obj);
        }


    }
}
