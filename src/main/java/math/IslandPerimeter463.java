package math;

/**
 * Created by fengliejv on 2017/10/4.
 */
public class IslandPerimeter463 {
    public int islandPerimeter(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        int landcount = 0;
        int wighge = 0;
        int height = grid.length;
        int wighth = grid[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wighth; j++) {
                if(grid[i][j]==1){
                    landcount++;
                    if(j+1<wighth){
                        if(grid[i][j+1]==1){
                            wighge++;
                        }
                    }
                    if(i+1<height){
                        if(grid[i+1][j]==1){
                            wighge++;
                        }
                    }
                }

            }
        }
        return 4*landcount-2*wighge;
    }
}
