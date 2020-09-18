package g_9September;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class GetTargetCopy {
    TreeNode res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        judge(cloned, target);
        return res;
    }
    public void judge(TreeNode cloned, TreeNode target){
        if(cloned == null || cloned.val == target.val){
            res = cloned;
            return;
        }
        else {
            judge(cloned.left, target);
            judge(cloned.right, target);
        }
    }
}
