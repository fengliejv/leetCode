package array;

import java.util.LinkedList;

/**
 * Created by fengliejv on 2017/12/6.
 */

public class AsteroidCollision735 {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> linkedList = new LinkedList();
        int i = 0;
        while (i < asteroids.length && asteroids[i] < 0) {
            linkedList.add(asteroids[i]);
            i++;
        }

        for (int j = i; j < asteroids.length; j++) {
            if (linkedList.size() == 0 || linkedList.getLast()<0||asteroids[j] > 0) {
                linkedList.add(asteroids[j]);
            } else if (-asteroids[j] > linkedList.getLast()) {
                linkedList.removeLast();
                j--;
            }else if(-asteroids[j]==linkedList.getLast()){
                linkedList.removeLast();
            }
        }
        int[] res = new int[linkedList.size()];
        for (int j = 0; j < linkedList.size(); j++) {
            res[j] = linkedList.get(j);
            System.out.println(res[j]);
        }
        return res;
    }
}
