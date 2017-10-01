package array;

/**
 * Created by fengliejv on 2017/10/1.
 */

public class ReshapetheMatrix566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int num = nums.length*nums[0].length;
        if(num<(r*(c-1)+1)||num>r*c){
            return nums;
        }
        int[][] val = new int[r][c];
        int m=0,n=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                val[m][n++]=nums[i][j];
                if(n==c){
                    n=0;
                    m++;
                }
            }
        }
        return val;
    }
}
