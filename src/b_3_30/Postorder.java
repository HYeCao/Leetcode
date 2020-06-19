package b_3_30;

import java.util.ArrayList;
import java.util.List;

public class Postorder {
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        get(root,list);
        return list;
    }
    public void get(Node root,List<Integer> list) {
        if(root==null)return;
        else {

            for(Node node:root.children){
                get(node,list);
            }
            list.add(root.val);
        }
    }
}
