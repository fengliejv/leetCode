package array;

/**
 * Created by fengliejv on 2017/11/29.
 */

public class DungeonGame174 {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon.length<1){
            return 0;
        }
        int x = dungeon.length;
        int y = dungeon[0].length;
        int[][] res = new int[x][y];
        if(dungeon[x-1][y-1]>=0){
            res[x-1][y-1]=1;
        }else {
            res[x-1][y-1]=Math.abs(dungeon[x-1][y-1])+1;
        }

        for (int i = x-2; i >=0 ; i--) {
            int val = res[i+1][y-1]-dungeon[i][y-1];
            if(val>0){
                res[i][y-1]=val;
            }else {
                res[i][y-1]=1;
            }
        }
        for (int i = y-2; i >=0 ; i--) {
            int val = res[x-1][i+1]-dungeon[x-1][i];
            if(val>0){
                res[x-1][i]=val;
            }else {
                res[x-1][i]=1;
            }
        }
        for (int i = x-2; i >=0 ; i--) {
            for (int j = y-2; j >=0 ; j--) {
                int val=Math.min(res[i+1][j],res[i][j+1])-dungeon[i][j];
                if(val>0){
                    res[i][j]=val;
                }else {
                    res[i][j]=1;
                }
            }
        }
        return res[0][0];

    }


//    public int calculateMinimumHP(int[][] dungeon) {
//        if(dungeon.length==0){
//            return 0;
//        }
//        //记录到达这个点过程中出现的最小少血量
//        int[][] grid = new int[dungeon.length][dungeon[0].length];
//        grid[0][0]=dungeon[0][0]<0?dungeon[0][0]:0;
//        for (int i = 1; i < dungeon.length; i++) {
//            dungeon[i][0]+=dungeon[i-1][0];
//            if(dungeon[i][0]<grid[i-1][0]){
//                grid[i][0] = dungeon[i][0];
//            }else {
//                grid[i][0] = grid[i-1][0];
//            }
//        }
//        for (int i = 1; i < dungeon[0].length; i++) {
//            dungeon[0][i]+=dungeon[0][i-1];
//            if(dungeon[0][i]<grid[0][i-1]){
//                grid[0][i] = dungeon[0][i];
//            }else {
//                grid[0][i] = grid[0][i-1];
//            }
//        }
//        for (int i = 1; i < dungeon.length; i++) {
//            for (int j = 1; j < dungeon[0].length; j++) {
//                if(grid[i-1][j]>grid[i][j-1]){
//                    dungeon[i][j]+=dungeon[i-1][j];
//                    if(dungeon[i][j]<grid[i-1][j]){
//                        grid[i][j]=dungeon[i][j];
//                    }else {
//                        grid[i][j]=grid[i-1][j];
//                    }
//                }else {
//                    dungeon[i][j]+=dungeon[i][j-1];
//                    if(dungeon[i][j]<grid[i][j-1]){
//                        grid[i][j]=dungeon[i][j];
//                    }else {
//                        grid[i][j]=grid[i][j-1];
//                    }
//
//                }
//            }
//        }
//        return Math.abs(grid[grid.length-1][grid[0].length-1])+1;
//    }
}
