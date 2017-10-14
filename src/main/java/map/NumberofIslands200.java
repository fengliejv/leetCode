package map;

/**
 * Created by fengliejv on 2017/10/14.
 */
public class NumberofIslands200 {
    int x;
    int y;
    public int numIslands(char[][] grid) {
        this.x=grid.length;
        if(x==0){
            return 0;
        }
        this.y=grid[0].length;
        int count = 0;
        for(int i=0;i<x;i++){
            for (int j = 0; j < y; j++) {
                if(grid[i][j]=='1'){
                    count++;
                    this.mark(i,j,grid);
                }
            }
        }
        return count;
    }
    private void mark(int x,int y,char[][] grid){
        if(x>this.x-1||x<0||y<0||y>this.y-1||grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        mark(x-1,y,grid);
        mark(x+1,y,grid);
        mark(x,y-1,grid);
        mark(x,y+1,grid);
    }

}
