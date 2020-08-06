package f_8August;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        queue.add(root);
        while(queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            for(int i = 0; i < len; i++){
                TreeNode tem = queue.poll();
                list.add(tem.val);
                if(tem.left != null)queue.add(tem.left);
                if(tem.right != null)queue.add(tem.right);
            }
            res.add(list);
        }
        return res;
    }
}
