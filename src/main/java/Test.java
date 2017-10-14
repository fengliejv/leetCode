/**
 * Created by fengliejv on 2017/9/11.
 */
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        char[][] board = new char[][]{
                {'X','X','X','X','X','X','X','X'},
                {'X','O','X','X','X','O','X','X'},
                {'X','O','O','X','X','O','O','X'},
                {'X','O','X','X','X','O','X','X'}
        };
        TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        SurroundedRegions130 jr = new SurroundedRegions130();
        jr.solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }






    }



}
