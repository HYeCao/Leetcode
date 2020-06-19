package a_3_24;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root,list);
        Collections.sort(list);
        int res=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=L&&list.get(i)<=R)res=res+list.get(i);
        }
        return res;
    }
    public void get(TreeNode node,ArrayList<Integer> list){
        if(node==null)return ;
        else {
            list.add(node.val);
            get(node.left,list);
            get(node.right,list);
        }

    }

}
