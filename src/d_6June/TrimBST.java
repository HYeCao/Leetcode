package d_6June;

public class TrimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null)return root;
        if(root.val<L){
            root=root.right;
            return trimBST(root,L,R);
        }
        else if(root.val>R){
           root=root.left;
           return trimBST(root,L,R);
        }
        else {
             root.left=trimBST(root.left,L,R);
             root.right=trimBST(root.right,L,R);
            return root;
        }
    }
}
/**
 * 与自己写的相对比
 * class Solution {
 *     public TreeNode trimBST(TreeNode root, int L, int R) {
 *         if (root == null) return root;
 *         if (root.val > R) return trimBST(root.left, L, R);
 *         if (root.val < L) return trimBST(root.right, L, R);
 *
 * //关键一步 左右子树递归：
 *         root.left = trimBST(root.left, L, R);
 *         root.right = trimBST(root.right, L, R);
 *         return root;
 *     }
 * }
 */
