package a_3_26;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        mirro(root);
        return root;
    }
    public void mirro(TreeNode node){
        if(node==null)return ;
        else {
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            mirro(node.left);
            mirro(node.right);
        }
    }
}
