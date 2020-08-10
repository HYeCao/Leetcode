package f_8August;

public class IsBalanced {
    /**
     * 判断平衡树的双重递归
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int le = judge(root.left);
        int ri = judge(root.right);
        if(Math.abs(le - ri) > 1)return false;//只能判断当前节点是否平衡
        return isBalanced(root.left) && isBalanced(root.right);//继续递归来判断是否全部节点都是平衡的
    }
    public int judge(TreeNode node){
        if(node == null)return 0;
        else {
            int le = judge(node.left) + 1;
            int ri = judge(node.right) + 1;
            return le > ri ? le : ri;
        }
    }
}
