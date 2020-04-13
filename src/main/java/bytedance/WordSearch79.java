package bytedance;

/**
 * Created by fengliejv on 2020/4/12.
 */
public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        if(word==null||word==""){
            return true;
        }
        if(board==null){
            return false;
        }
        int x = board.length;
        int y = board[0].length;
        Boolean[][] visited = new Boolean[x][y];
        init(visited);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(valid(i,j,board,0,word,visited)){
                    return true;
                }
            }
        }

        return false;

    }

    private boolean valid(int i, int j, char[][] board, int index, String word, Boolean[][] visited) {
        if(index==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length){
            return false;
        }
        if(visited[i][j]){
            return false;
        }

        if(word.charAt(index)==board[i][j]){
            visited[i][j] = true;
            boolean result = valid(i+1,j,board,index+1,word,visited)
                    || valid(i-1,j,board,index+1,word,visited)
                    || valid(i,j+1,board,index+1,word,visited)
                    || valid(i,j-1,board,index+1,word,visited);
            if(!result){
                visited[i][j] = false;
            }
            return result;
        }else {
            return false;
        }
    }

    private void init(Boolean[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                visited[i][j]=false;
            }
        }
    }
}
