package math;

/**
 * Created by fengliejv on 2017/11/14.
 */
public class ClimbingStairs70 {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int first = 1;
        int second = 2;
        int sum=0;
        for (int i = 2; i < n; i++) {
            sum = first+second;
            first=second;
            second=sum;
        }
        return second;

    }


//    int count = 0;
//    public int climbStairs(int n) {
//        if(n==0){
//            count++;
//            return count;
//        }
//        if(n<0){
//            return count;
//        }
//        climbStairs(n-1);
//        climbStairs(n-2);
//        return count;
//    }
}
