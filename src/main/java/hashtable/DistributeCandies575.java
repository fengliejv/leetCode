package hashtable;

import java.util.Arrays;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class DistributeCandies575 {
    public int distributeCandies(int[] candies) {
        int length = candies.length;
        if(length==0){
            return 0;
        }
        Arrays.sort(candies);
        int count =difference(candies);
        return count>length/2?length/2:count;
    }

    private int difference(int[] candies){
        int count = 1;
        int cur = candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]!=cur){
                cur = candies[i];
                count++;
            }
        }
        return count;
    }

}
