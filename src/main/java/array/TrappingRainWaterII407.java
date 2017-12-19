package array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Created by fengliejv on 2017/12/3.
 */
public class TrappingRainWaterII407 {
    class Pos{
        int height;
        int x;
        int y;
        public Pos(int height,int x,int y){
            this.height=height;
            this.x=x;
            this.y=y;
        }
    }
    public int trapRainWater(int[][] heightMap) {
        int sum = 0;
        if (heightMap.length == 0) {
            return sum;
        }
        PriorityQueue<Pos> priorityQueue = new PriorityQueue<>(new Comparator<Pos>() {
            @Override
            public int compare(Pos o1, Pos o2) {
                return o1.height-o2.height;
            }
        });
        boolean[][] flag = new boolean[heightMap.length][heightMap[0].length];
        for (int i = 0; i < heightMap.length; i++) {
            priorityQueue.add(new Pos(heightMap[i][0],i,0));
            priorityQueue.add(new Pos(heightMap[i][heightMap[0].length-1],i,heightMap[0].length-1));
            flag[i][0] = true;
            flag[i][heightMap[0].length-1] = true;
        }
        for (int i = 1; i < heightMap[0].length-1; i++) {
            priorityQueue.add(new Pos(heightMap[0][i],0,i));
            priorityQueue.add(new Pos(heightMap[heightMap.length-1][i],heightMap.length-1,i));
            flag[0][i] = true;
            flag[heightMap.length-1][i] = true;
        }

        int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!priorityQueue.isEmpty()) {
            Pos pos = priorityQueue.poll();
            int x = pos.x;
            int y = pos.y;
//            flag[x][y] = true;
            for (int i = 0; i < dir.length; i++) {
                int xx = x + dir[i][0];
                int yy = y + dir[i][1];
                if (xx < 0 || xx >= heightMap.length || yy < 0 || yy >= heightMap[0].length || flag[xx][yy]) {
                    continue;
                }
                flag[xx][yy] = true;
                if (heightMap[xx][yy] > pos.height) {
                    priorityQueue.offer(new Pos(heightMap[xx][yy],xx, yy));
                } else {
                    sum += (pos.height - heightMap[xx][yy]);
                    priorityQueue.offer(new Pos(pos.height,xx,yy));
                }
            }
        }
        return sum;
    }

}
