package c_5May;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 */
public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root,list);
        Collections.sort(list);
        TreeNode res=new TreeNode(list.get(0));
        root=res;
        for(int i=1;i<list.size();i++){
            res.right=new TreeNode(list.get(i));
            res=res.right;
        }
        return root;
    }
    public void get(TreeNode node, ArrayList<Integer> list){
        if(node==null)return;
        else {
            list.add(node.val);
            get(node.left,list);
            get(node.right,list);
        }
    }
}
