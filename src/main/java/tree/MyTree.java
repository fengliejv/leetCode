package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class MyTree {


    public Node root;

    public MyTree() {
        root = null;
    }

    public MyTree(int[] in) {
        buildTree(in);
    }

    //二叉搜素树建树
    public void buildTree(int[] in) {
        if (in.length < 1)
            System.out.print("input error");
        root = new Node(in[0]);
        for (int i = 0; i < in.length - 1; i++) {
            Node newNode = new Node(in[i + 1]);
            insert(newNode);
        }
    }

    //二叉树插入节点
    public void insert(Node node) {
        Node currentNode = root;
        if (root == null)
            root = node;
        else {
            while (true) {
                if (node.value < currentNode.value) {
                    if (currentNode.lchild == null) {
                        currentNode.lchild = node;
                        //System.out.println(node.value);
                        return;
                    } else
                        currentNode = currentNode.lchild;
                } else {
                    if (currentNode.rchild == null) {
                        currentNode.rchild = node;
                        //System.out.println(node.value);

                        return;
                    } else
                        currentNode = currentNode.rchild;
                }
            }
        }
    }

    //二叉树中序遍历
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.lchild);
            System.out.print(node.value);
            inorder(node.rchild);
        }
    }

    public void inorder() {
        inorder(this.root);
    }

    //二叉树先序遍历
    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.value);
            preorder(node.lchild);
            preorder(node.rchild);
        }
    }

    public void preorder() {
        preorder(this.root);
    }

    //二叉树后续遍历
    public void postorder(Node node) {
        if (node != null) {
            postorder(node.lchild);
            postorder(node.rchild);
            System.out.print(node.value);
        }
    }

    public void postorder() {
        postorder(this.root);
    }

    //二叉树层序遍历
    public void layerorder() {
        Queue<Node> queue = new LinkedList<Node>();
        if (root == null)
            System.out.print("the tree is null");
        else {
            queue.offer(root);
            while (queue.size() != 0) {
                Node nowNode = queue.poll();
                System.out.print(nowNode.value);
                if (nowNode.lchild != null)
                    queue.offer(nowNode.lchild);
                if (nowNode.rchild != null)
                    queue.offer(nowNode.rchild);
            }
        }
    }


    //已知前序和中序遍历，建树-------------------------------------------------------------
    public Node initTree(int[] pre, int[] mid) {
        return initTree(pre, 0, pre.length - 1, mid, 0, mid.length - 1);
    }

    public Node initTree(int[] pre, int start1, int end1, int[] mid, int start2, int end2) {
        if (start1 > end1 || start2 > end2) {
            return null;
        }
        Node headNode = new Node(pre[start1]);
        int indexOfHeadInMid = findHeadIndex(headNode.value, mid, start2, end2);
        int offset = indexOfHeadInMid - start2;
        Node leftNode = initTree(pre, start1 + 1, start1 + offset, mid, start2, start2 + offset - 1);
        Node rightNode = initTree(pre, start1 + offset + 1, end1, mid, indexOfHeadInMid + 1, end2);
        headNode.lchild = leftNode;
        headNode.rchild = rightNode;
        return headNode;
    }

    //在mid中找到head的index
    private int findHeadIndex(int head, int[] mid, int start2, int end2) {
        //int index=0;
        for (int i = start2; i < end2 + 1; i++) {
            if (mid[i] == head) {
                return i;
                //index=i;
                //	break;
            }
        }
        return -1;
        //return index;
    }



}


class Node  {
    int value;
    Node lchild;
    Node rchild;
    int height;//AVL树作为是否需要调整的依据

    public Node() {
        super();
    }

    public Node(int value) {

        this.value = value;
        lchild = null;
        rchild = null;
        height = 0;
    }
}



