package d_6June;

import java.util.ArrayList;

public class LeafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null)return false;
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        get(root1,list1);
        get(root2,list2);
        if(list1.size()!=list2.size())return false;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i))return false;
        }
        return true;
        // return list1.equals(list2); 直接比大小
    }
    public void get(TreeNode node,ArrayList<Integer> list){
        if(node==null)return;
        if(node.left==null&&node.right==null){
            list.add(node.val);
            return;
        }
        else {
            get(node.left,list);
            get(node.right,list);
        }
    }
}
