package math;

/**
 * Created by fengliejv on 2017/10/20.
 */

public class TrappingRainWater42 {
    public int trap(int[] height) {
        if(height.length<3){
            return 0;
        }
        int area = 0;
        int begin=0;
        int end = height.length-1;
        while (begin<end-1&&height[begin+1]>height[begin]){
            begin++;
        }
        while (begin+1<end&&height[end-1]>height[end]){
            end--;
        }
        while (begin<end){
            int begin_max = height[begin];
            int end_max = height[end];
            while (begin<end&&height[begin]<=height[end]){
                if(height[++begin]<begin_max){
                    area+=begin_max-height[begin];
                }else {
                    begin_max=height[begin];
                }
            }
            while (begin<end&&height[begin]>height[end]){
                if(height[--end]<end_max){
                    area+=end_max-height[end];
                }else {
                    end_max=height[end];
                }
            }

        }
        return area;
    }

}
