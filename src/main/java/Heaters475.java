import java.util.Arrays;

/**
 * Created by fengliejv on 2017/9/10.
 */
public class Heaters475 {
    //todo sth wrong exit
    class Solution {
        public int findRadius(int[] houses, int[] heaters) {
            Arrays.sort(heaters);
            Arrays.sort(houses);
            int max = 0;
            int a = heaters[0]-houses[0];
            for(int i=0;i<heaters.length-1;i++){
                int c = heaters[i+1]-heaters[i]-1;
                if(c>max)
                    max=c;
            }
            max = max/2;
            int b = houses[houses.length-1]-heaters[heaters.length-1];
            if(a>max){
                max=a;
            }
            if(b>max)
                max = b;
            return max;
        }
    }
}
