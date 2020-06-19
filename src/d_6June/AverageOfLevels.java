package d_6June;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedBlockingQueue<>();
        List<Double> list=new ArrayList<>();
        queue.add(root);
        while(queue.size()!=0){
            int len=queue.size();
            double tem=0;
            double num=0;
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                tem+=node.val;
                num++;
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            list.add(tem/num);
        }
        return list;
    }
}
