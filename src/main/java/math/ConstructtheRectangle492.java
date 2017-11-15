package math;

/**
 * Created by fengliejv on 2017/11/15.
 */
public class ConstructtheRectangle492 {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int height = (int) Math.sqrt(area);
        int wighth = height;
        while (wighth>0){
            if(height*wighth==area){
                res[0] = height;
                res[1] = wighth;
                return res;
            }else if(height*wighth>area){
                wighth--;
            }else {
                height++;
            }
        }
        return null;
    }
}
