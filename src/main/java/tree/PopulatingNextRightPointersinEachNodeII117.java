package tree;

/**
 * Created by fengliejv on 2018/11/2.
 */
public class PopulatingNextRightPointersinEachNodeII117 {
    public void connect(TreeLinkNode root) {
        while (root!=null){
            TreeLinkNode tmp = new TreeLinkNode(0);
            TreeLinkNode cur = tmp;
            while (root!=null){
                if(root.left!=null){
                    cur.next=root.left;
                    cur=cur.next;
                }
                if(root.right!=null){
                    cur.next=root.right;
                    cur=cur.next;
                }
                root = root.next;
            }
            root = tmp.next;
        }
    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}