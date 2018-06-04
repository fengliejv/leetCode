/**
 * Created by fengliejv on 2017/9/11.
 */
import array.AsteroidCollision735;
import array.DungeonGame174;
import array.Searcha2DMatrixII240;
import array.TrappingRainWaterII407;
import di.CountingBit338;
import di.PerfectSquares279;
import di.Triangle120;
import math.TrappingRainWater42;
import tree.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
//import tree.Bit


public class Test {
    static void init(List<List<Integer>> listList ,int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i:arr
             ) {
            list.add(i);
        }
        listList.add(list);
    }
    public static void main(String[] args) {
        List<List<Integer>> listList = new ArrayList<>();
        init(listList,new int[]{2});
        init(listList,new int[]{3,4});
        init(listList,new int[]{6,5,7});
        init(listList,new int[]{4,1,8,3});

        Triangle120 countingBit338 = new Triangle120();
        countingBit338.minimumTotal(listList);

        int[][] grifd= new int[][]{{-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
                                    };
        int[][] g= new int[][]{{-1},{-1},

        };
        int[] a = new int[]{5,10,-5};
        int[] b = new int[]{-2,-2,1,-2};
//        int[] c = new int[]{4,3,2,1};
//        int num  =2126753390;
//        ListNode node = new ListNode();
//        ListNode n = node.init(a);
//        String s ="cbaebabacd";
//        String t ="abc";
        TreeMap map = new TreeMap();
        map.put(5,5);
        map.put(3,2);
        map.put(4,2);
        map.put(7,2);
        map.put(9,2);
        map.put(8,2);
        map.put(1,2);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

int[][] grid = new int[][]{
        {1, 3, 3, 1, 3, 2},
        {3, 2, 1, 3, 2, 3},
        {3, 3, 3, 2, 3, 1}
};
int[][] gg = new int[][]{
        {1,3,3,1,3,2},
        {3,2,1,3,2,3},
        {3,3,3,2,3,1}
};
//        System.out.println(map.firstKey());
//        TreeNode node = TreeNode.createBinTree(new int[]{1,0,2});
//        TrappingRainWaterII407 jr = new TrappingRainWaterII407();
//
//        System.out.println( jr.trapRainWater(gg));
//        System.out.println(jr.trapRainWater(grid));
//        System.out.println( jr.numSquares(13));




//        System.out.println(jr.reverseBits(   ));

    }
    private static  void printTree(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }



}
