package array;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class FirstBadVersion278 {
    public int firstBadVersion(int n) {
        return this.firstBadVersion(1,n);
    }

    public int firstBadVersion(int start,int end) {
        if(start==end){
            return start;
        }
        int mid = start+(end-start)/2;
        if(isBadVersion(mid)){
            if(!isBadVersion(mid-1)){
                return mid;
            }else{
                return firstBadVersion(start,mid-1);
            }

        }else{
            if(isBadVersion(mid+1)){
                return mid+1;
            }else{
                return firstBadVersion(mid+1,end);
            }
        }
    }
    private boolean isBadVersion(int i){
        return true;
    }
}
