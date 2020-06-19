package b_3_30;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
        TreeNode node3=new TreeNode(4);
        TreeNode node4=new TreeNode(5);
        node.left=node1;
        node.right=node2;
        node1.left=node3;
        node1.right=node4;
        maxDepth(node);
    }
    public static int maxDepth(TreeNode root) {
        Integer res=0;
        res=get(root,0,res);
        return res;
    }
    public static int get(TreeNode node,int len,Integer res){
        if(node==null){
            System.out.println(len+" "+res);
            if(len>res)res=len;
            return res;
        }
        else {
            res=get(node.left,len+1,res);
            res=get(node.right,len+1,res);
            System.out.println(len+" "+res);
            return res;
        }
    }
}
