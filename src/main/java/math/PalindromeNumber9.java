package math;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        int xx = x;
        int rever = 0;
        while (xx>0){
            rever=rever*10+xx%10;
            xx=xx/10;
        }
        if(x==rever){
            return true;
        }else {
            return false;
        }
    }
//    public boolean isPalindrome(int x) {
//        if(x<0){
//            return false;
//        }
//        if(x<10){
//            return true;
//        }
//        int count =10;
//        while (x/count!=0){
//            count = count*10;
//        }
//        count=count/10;
//        while (x>10){
//            int high = x/count;
//            int low = x%10;
//            if(high!=low){
//                return false;
//            }
//            x = x%count/10;
//        }
//        return true;
//    }
//    public boolean isPalindrome(int x) {
//        if(x==0){
//            return true;
//        }
//        int pre = 0x80000000;
//        int last = 0x00000001;
//        while ((pre&x)!=pre){
//            pre = pre>>>1;
//            //System.out.printf("1");
//        }
//        while (pre!=last){
//            int a = x&pre;
//            int b = x&last;
//            if(a==b||(a!=0&&b!=0)){
//                pre = pre>>1;
//                last = last<<1;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
}
