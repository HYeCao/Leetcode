package a_3_23;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一棵二叉树的根节点，求该树的深度。
 * 从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3
 * 思路：递归调用
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        depth(root, list, 0);
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public void depth(TreeNode node, ArrayList<Integer> list, int depth) {
        if (node == null) {
            return;
        } else if (node.left == null && node.right == null) {
            depth = depth + 1;
            list.add(depth);
            depth = 0;
            return;
        } else {
            depth(node.left, list, depth + 1);
            depth(node.right, list, depth + 1);
        }
    }
}
