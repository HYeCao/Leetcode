package b_4_2;

import sun.reflect.generics.tree.Tree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
  */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return get(nums,0,nums.length-1);
    }
    public TreeNode get(int[] nums,int x,int y){
        if(x>y)return null;
        ////寻找新子树的根节点（若节点剩余个数为偶数个取右）
        int mid = (x + y) / 2 + (x + y) % 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (x == y) return node;
        node.left=get(nums,x,mid-1);
        node.right=get(nums,mid+1,y);
        return node;
    }
}
