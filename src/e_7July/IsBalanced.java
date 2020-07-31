package e_7July;

public class IsBalanced {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
        isBalanced(node1);
    }
    public static boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        return  depth(root) != -1;
    }
    public static int depth(TreeNode root){
        if(root == null)return 0;
        int le = depth(root.left);
        if(le == -1)return -1;
        int ri = depth(root.right);
        if(ri == -1)return -1;
        return Math.abs(le - ri) > 1 ? -1 : Math.max(le , ri) + 1;
    }
}
