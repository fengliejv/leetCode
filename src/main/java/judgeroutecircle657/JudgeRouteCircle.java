package judgeroutecircle657;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/8/30.
 */
public class JudgeRouteCircle {
    class Solution {
        public boolean judgeCircle(String moves) {
            char[] move = moves.toCharArray();
            HashMap<Character, Integer> moveMap = new HashMap<Character, Integer>();
            for (char cha : move) {
                if (moveMap.containsKey(cha)) {
                    int x = moveMap.get(cha);
                    x++;
                    moveMap.put(cha, x);
                } else {
                    moveMap.put(cha, 1);
                }
            }
            int l = 0;
            int r = 0;
            int u = 0;
            int d = 0;

            if(moveMap.containsKey('L')){
                l = moveMap.get('L');
            }
            if(moveMap.containsKey('R')){
                r = moveMap.get('R');
            }
            if(moveMap.containsKey('U')){
                u = moveMap.get('U');
            }
            if(moveMap.containsKey('D')){
                d = moveMap.get('D');
            }
            //System.out.println(l+d);
            if(l==r&&u==d){
                return true;
            }else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
//        judgeroutecircle657.JudgeRouteCircle jr = new judgeroutecircle657.JudgeRouteCircle();
//        Solution solution = jr.new Solution();
//        System.out.println(solution.judgeCircle("LL"));
        System.out.println(new JudgeRouteCircle().new Solution().judgeCircle("LL"));
    }
}
