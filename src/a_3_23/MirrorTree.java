package a_3_23;

/**
 * 二叉树镜像
 * 思路：递归调用
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        mirro(root);
        return root;
    }
    public void mirro(TreeNode root){
        if(root==null)return;
        TreeNode node=root.left;
        root.left=root.right;
        root.right=node;
        mirro(root.left);
        mirro(root.right);
    }
}
