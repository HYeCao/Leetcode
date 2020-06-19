package b_4_12;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode res=p;
            p=q;
            q=res;
        }
        if(root.val>=p.val&&root.val<=q.val)return root;
        else if(root.val<p.val)return lowestCommonAncestor(root.right,p,q);
        else return lowestCommonAncestor(root.left,p,q);
    }
}
