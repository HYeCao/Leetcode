package d_6June;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        get(list,root,new String());
        return list;
    }
    public void get(List<String> list,TreeNode root,String str){
        if(root==null)return;
        else if(root.left==null&&root.right==null){
            if(str.length()==0)str+=root.val;
            else {
                str += "->" + root.val;
            }
            list.add(str);
        }
        else {
            if(str.length()==0)str+=root.val;
            else{
            str +="->"+root.val;}
            get(list,root.left,str);
            get(list,root.right,str);
        }
    }


}
