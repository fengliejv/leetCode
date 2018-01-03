package math;

/**
 * Created by fengliejv on 2018/1/3.
 */
public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if(board[i][j]!='.'){
                    char v = board[i][j];
                    for (int k = 0; k < 9; k++) {
                        if(k!=j&&board[i][k]==v)return false;
                        if(k!=i&&board[k][j]==v)return false;
                        int row = 3*(i/3)+k/3;
                        int col = 3*(j/3)+k%3;
                        if(row!=i&&col!=j&&board[row][col]==v)return false;
                    }
                }
            }
        }
        return true;
    }
}
