import java.util.Arrays;

/**
 * Created by fengliejv on 2017/9/10.
 */

/*binary search nlgn complex
* */
public class Heaters475 {
    //todo sth wrong exit
    class Solution {

        public int findRadius(int[] houses, int[] heaters) {
            int max =0;
            Arrays.sort(heaters);
           for(int house:houses){
               int dis = this.getMinDis(house,heaters,0,heaters.length-1);
               max = max>dis?max:dis;
           }
            return max;
        }
        public int getMinDis(int a,int[] heaters,int start,int end){
            int mid = (start+end)/2;
            if(start==mid){
                return min(Math.abs(a-heaters[mid]),Math.abs(a-heaters[end]));
            }
            if(heaters[mid]==a){
                return 0;
            }
            if(heaters[mid]>a){
                return getMinDis(a,heaters,start,mid);
            }else{
                return  getMinDis(a,heaters,mid,end);
            }
        }

        public int min(int a,int b){
            return a<b?a:b;
        }
    }

    //        public int findRadius(int[] houses, int[] heaters) {
//            Arrays.sort(heaters);
//            Arrays.sort(houses);
//            int max = 0;
//            int a = heaters[0]-houses[0];
//            for(int i=0;i<heaters.length-1;i++){
//                int c = heaters[i+1]-heaters[i]-1;
//                if(c>max)
//                    max=c;
//            }
//            max = max/2;
//            int b = houses[houses.length-1]-heaters[heaters.length-1];
//            if(a>max){
//                max=a;
//            }
//            if(b>max)
//                max = b;
//            return max;
//        }
}
