package f_8August;


public class FindTilt {
    static int res;

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        findTilt(node1);
    }

    /**
     * 重点：题目的思考，看懂题目！！
     * @param root
     * @return
     */
    public static int findTilt(TreeNode root) {
        res = 0;
        get(root);
        System.out.println(res);
        return res;
    }
    public static int get(TreeNode node){
        if(node == null)return 0;
        else {
            int le = get(node.left);
            int ri = get(node.right);
            res += Math.abs(le - ri);
            return node.val + le + ri;
        }
    }
}
