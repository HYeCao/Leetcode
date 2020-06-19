package d_6June;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(p.val>q.val)return get(root,q,p);
       else return get(root,p,q);
    }
    public TreeNode get(TreeNode root, TreeNode p, TreeNode q){
        if(root.val>=p.val&&root.val<=q.val)return root;
        else if(root.val>p.val&&root.val>q.val)return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
}
