package array;

/**
 * Created by fengliejv on 2017/11/17.
 */
public class TeemoAttacking495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        int time = duration;
        for (int i = 0; i < timeSeries.length-1; i++) {
            time+= (timeSeries[i+1]-timeSeries[i])>duration?duration:(timeSeries[i+1]-timeSeries[i]);
        }
        return time;

    }
}
