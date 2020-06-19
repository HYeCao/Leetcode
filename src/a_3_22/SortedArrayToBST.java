package a_3_22;

import java.util.Arrays;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
/**
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 *思路：递归构造，每次都是从最中间选取节点，然后构造左右子树，依次递归
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode n = new TreeNode(nums[nums.length/2]);
        n.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
        n.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
        return n;
    }
}
