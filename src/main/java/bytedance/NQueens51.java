package bytedance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by fengliejv on 2020/4/12.
 */
public class NQueens51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] chessboard = new char[n][n];
        init(chessboard);
        dfs(chessboard,0,result);
        return result;
    }


    private void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if(colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for(int i = 0; i < board.length; i++) {
            if(validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }
    }

    private boolean validate(char[][] board, int x, int y) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i))
                    return false;
            }
        }

        return true;
    }


    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    private void init(char[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++)
            for (int j = 0; j < chessboard[0].length; j++)
                chessboard[i][j] = '.';
    }



}
