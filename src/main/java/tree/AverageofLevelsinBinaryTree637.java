package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/9.
 */
public class AverageofLevelsinBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        List<Double> result = new ArrayList<>();
        list.add(root);
        calculatr(list,result);
        return result;
    }
    private void calculatr(ArrayList<TreeNode> list,List<Double> result){

    }
}
