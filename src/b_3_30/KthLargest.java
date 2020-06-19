package b_3_30;

import java.util.ArrayList;

/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * 思路：从右向左遍历，从最大的往最小的遍历，直接读取第k个节点即可
 */
public class KthLargest {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root,list);
        System.out.println(list);
        return list.get(k-1);
    }
    public void get(TreeNode node,ArrayList<Integer> list){
        if(node==null)return ;
        else {
            get(node.right,list);
            list.add(node.val);
            get(node.left,list);//注意此处位置的设定
        }
    }
}
