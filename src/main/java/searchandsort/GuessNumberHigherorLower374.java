package searchandsort;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class GuessNumberHigherorLower374 {
    public int guessNumber(int n) {

        return guess(1,n);
    }

    int guess(int begin,int end){
        int mid = (end-begin)/2+begin;
        int res = guess(mid);
        if(res == 0){
            return mid;
        }
        if(res==-1){
            return guess(begin,mid-1);
        }else {
            return guess(mid+1,end);
        }
    }


    int guess(int num){
        return 1;
    }
}
