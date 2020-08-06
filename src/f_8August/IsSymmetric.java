package f_8August;

import sun.reflect.generics.tree.Tree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

/**
 * 判断是不是对称的二叉树
 * 思路：使用队列入队列出队列来判断
 * 正确思路：
 * 1. 如果两颗树的根都为空，返回true
 * 2. 如果一颗为空另一颗不为空返回false
 * 3. 如果两颗都不为空，如果根节点的值不相等返回false
 * 4. 如果值相等，那么判断ltree的左子树与rtree的右子树，ltree的右子树与rtree的左子树是否同时对称，一旦一个不满足，则返回false
 * 5. 所有情况满足，最终返回true
 */
public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(9);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node2.right = node4;
        isSymmetric(node);
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return judge(root.left, root.right);
    }
    public static boolean judge(TreeNode le, TreeNode ri){
        if(le == null && ri == null)return true;
        else if(le == null || ri == null ||le.val != ri.val)return false;
        else {
            return judge(le.left, ri.right) && judge(le.right, ri.left);
        }
    }
}
