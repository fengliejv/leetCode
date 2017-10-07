package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class PathSumII113 {
    List<List<Integer>> list = new ArrayList<>();
    int sum;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return list;
        }
        this.sum = sum;
        addList(root, new ArrayList<Integer>());
        return list;
    }

    private void addList(TreeNode node, ArrayList<Integer> arrayList) {
        arrayList.add(node.val);
        if (node.left == null && node.right == null) {
            int num = 0;
            for (int a : arrayList
                    ) {
                num = num + a;
            }
            if (num == sum) {
                list.add(arrayList);
            }
            return;
        }
        if (node.left != null) {
            addList(node.left, (ArrayList<Integer>) arrayList.clone());
        }
        if (node.right != null) {
            addList(node.right, (ArrayList<Integer>) arrayList.clone());
        }
    }
}
