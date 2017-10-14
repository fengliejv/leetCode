package map;

/**
 * Created by fengliejv on 2017/10/14.
 */
public class SurroundedRegions130 {
    //for complex case will stack overflow
//    int x;
//    int y;
//    boolean[][] map;
//    public void solve(char[][] board) {
//        x=board.length;
//        if(x==0){
//            return;
//        }
//        y=board[0].length;
//        map = new boolean[x][y];
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                if(board[i][j]=='O'){
//                    if(!map[i][j]) {
//                        //map[i][j]=true;
//                        if (shouldChange(i, j, board)) {
//                            board[i][j] = 'X';
//                        }
//
//                    }
//                }
//            }
//
//        }
//    }
//
//    private boolean shouldChange(int x,int y,char[][] board){
//        if(x<0||x>this.x-1||y<0||y>this.y-1){
//            return false;
//        }
//        if(map[x][y]){
//            return true;
//        }
//
//        if(board[x][y]=='X'){
//            return true;
//        }
//        map[x][y]=true;
//        if(shouldChange(x-1,y,board)&&shouldChange(x+1,y,board)&&shouldChange(x,y-1,board)&&shouldChange(x,y+1,board)){
//            board[x][y]='X';
//            return true;
//        }else {
//            return false;
//        }
//    }
    int x;
    int y;
    boolean[][] changeMap;

    public void solve(char[][] board) {
        x = board.length;
        if (x == 0) {
            return;
        }
        y = board[0].length;
        changeMap = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            if (board[i][0] == 'O') {
                dfs(i, 0, board);
            }
            if (board[i][y - 1] == 'O') {
                dfs(i, y - 1, board);

            }
        }
        for (int i = 1; i < y - 1; i++) {
            if (board[0][i] == 'O') {
                dfs(0, i, board);

            }
            if (board[x - 1][i] == 'O') {
                dfs(x - 1, i, board);

            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'O' && !changeMap[i][j]) {
                    board[i][j] = 'X';
                }

            }
        }


    }

    private void dfs(int x, int y, char[][] board) {
        if (x < 0 || x > this.x - 1 || y < 0 || y > this.y - 1 || board[x][y] == 'X') {
            return;
        }
        if(changeMap[x][y]){
            return;
        }
        changeMap[x][y] = true;
        dfs(x, y + 1, board);
        dfs(x, y - 1, board);
        dfs(x - 1, y, board);
        dfs(x + 1, y, board);
    }

}
