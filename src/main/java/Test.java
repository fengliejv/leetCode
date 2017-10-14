/**
 * Created by fengliejv on 2017/9/11.
 */
import map.MaxAreaofIsland695;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        MaxAreaofIsland695 jr = new MaxAreaofIsland695();
        System.out.println(jr.maxAreaOfIsland(grifd));






    }



}
