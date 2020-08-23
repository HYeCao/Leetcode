package f_8August;


public class SumOfLeftLeaves {
    int res;
    public int sumOfLeftLeaves(TreeNode root) {
        res = 0;
        get(root);
        return res;
    }
    public void get(TreeNode node){
        if(node == null)return;
        else {
            if(node.left != null && node.left.left == null && node.left.right == null)res += node.left.val;
            get(node.left);
            get(node.right);
        }
    }
}
