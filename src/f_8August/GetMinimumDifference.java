package f_8August;

import java.util.ArrayList;
import java.util.Collections;

public class GetMinimumDifference {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list =new ArrayList<>();
        get(root, list);
        Collections.sort(list);
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < list.size() - 1; i++){
            if(res < Math.abs(list.get(i) - list.get(i - 1))){
                res = Math.abs(list.get(i) - list.get(i - 1));
            }
        }
        return res;
    }
    public static void get(TreeNode node, ArrayList<Integer> list){
        if(node == null)return;
        else {
            list.add(node.val);
            get(node.left, list);
            get(node.right, list);
        }
    }

}
