package map;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by fengliejv on 2017/10/14.
 */

public class MaxAreaofIsland695 {
    int[][] map ;
    int x;
    int y;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
         x = grid.length;
         y = grid[0].length;
        map = new int[x][y];
        int max =0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(map[i][j]!=1){
                    if(grid[i][j]==1){
                       int size = this.serch(i,j,grid,0);
                       if(size>max){
                           max=size;
                       }
                    }
                }
            }
        }
        return max;
    }

    private int serch(int x,int y,int[][] grid,int count){
        if(this.x-1<x||this.y-1<y||y<0||x<0||map[x][y]==1){
            return count;
        }
        map[x][y]=1;
        if(grid[x][y]==1){
            count++;
            return serch(x,y+1,grid,count)+ serch(x+1,y,grid,count)+ serch(x-1,y,grid,count)-3*count+serch(x,y-1,grid,count);

        }else {
            return count;
        }
    }
}
