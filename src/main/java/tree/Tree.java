package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class Tree {
    TreeNode root;
    public TreeNode buildTree(int[] in) {
        if (in.length < 1)
            System.out.print("input error");
        root = new TreeNode(in[0]);
        for (int i = 0; i < in.length - 1; i++) {
            TreeNode newNode = new TreeNode(in[i + 1]);
            layerInsert(newNode);
        }
        return root;
    }


    public void layerInsert(TreeNode node){
        
    }

    public void binaryInsert(TreeNode node) {
        TreeNode currentNode = root;
        if (root == null)
            root = node;
        else {
            while (true) {
                if (node.val < currentNode.val) {
                    if (currentNode.left == null) {
                        currentNode.left = node;
                        //System.out.println(node.value);
                        return;
                    } else
                        currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = node;
                        //System.out.println(node.value);

                        return;
                    } else
                        currentNode = currentNode.right;
                }
            }
        }
    }
}
