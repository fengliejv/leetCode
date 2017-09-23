/**
 * Created by fengliejv on 2017/9/11.
 */
import String.*;
import math.Sqrt69;
import tree.BinaryTreeTilt563;
import tree.MyTree;
import tree.Tree;
import tree.TreeNode;

public class Test {
    public static void main(String[] args) {
        int[] value = {1,2,3};
        Tree tree = new Tree();
        TreeNode treeNode = tree.buildTree(value);
        BinaryTreeTilt563 jr = new BinaryTreeTilt563();
        System.out.println(jr.findTilt(treeNode));
       // Solution solution = jr.new Solution();
        //System.out.println(jr.findTilt());





    }
}
