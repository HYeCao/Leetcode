package d_6June;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<TreeNode>> lists=new ArrayList<>();
        ArrayList<TreeNode> list=new ArrayList<>();
        list.add(root);
        lists.add(list);
        int i=0;
        while(true){
            ArrayList<TreeNode> tem=new ArrayList<>();
            for(int j=0;j<lists.get(i).size();j++) {
                if (lists.get(i).get(j) != null) {
                    if(lists.get(i).get(j).left!=null)
                    tem.add(lists.get(i).get(j).left);
                    if(lists.get(i).get(j).right!=null)
                    tem.add(lists.get(i).get(j).right);
                }
            }
            lists.add(tem);
            i++;
            if(tem.size()==0)break;
        }
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> tem=new ArrayList<>();
        for(int a=lists.size()-1;a>=0;a--){
            for(int b=0;b<lists.get(a).size();b++){
                if(lists.get(a).get(b)!=null)
                tem.add(lists.get(a).get(b).val);
            }
            if(tem.size()!=0)
            res.add(tem);
            tem=new ArrayList<>();
        }
        return res;
    }
}
/**
 * 队列的使用：
 * class Solution {
 *     public List<List<Integer>> levelOrderBottom(TreeNode root) {
 *         List<List<Integer>> result = new LinkedList<>();
 *         if(root == null){
 *             return result;
 *         }
 *         Queue<TreeNode> queue = new LinkedList<>();
 *         queue.offer(root);
 *         while(!queue.isEmpty()){
 *             List<Integer> curLevel = new LinkedList<>();
 *             int levelSize = queue.size();
 *             for(int i = 0; i < levelSize; i++){
 *                 TreeNode curNode = queue.poll();
 *                 curLevel.add(curNode.val);
 *                 if(curNode.left != null){
 *                     queue.add(curNode.left);
 *                 }
 *                 if(curNode.right != null){
 *                     queue.add(curNode.right);
 *                 }
 *             }
 *             result.add(0, curLevel);
 *         }
 *         return result;
 *     }
 * }
 */
