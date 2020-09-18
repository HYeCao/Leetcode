package g_9September;

import sun.reflect.generics.tree.Tree;

public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int tem = max(nums, 0, nums.length);
        TreeNode root = new TreeNode(nums[tem]);
        root.left = get(0, tem, nums);
        root.right = get(tem+1, nums.length, nums);
        return root;
    }
    public TreeNode get(int le, int ri, int[] nums){
        if(le >= ri)return null;
        else {
            int tem = max(nums, le, ri);
            TreeNode node = new TreeNode(nums[tem]);
            node.left = get(le, tem, nums);
            node.right = get(tem+1, ri, nums);
            return node;
        }
    }
    public int max(int[] nums, int i, int j){
        int tem = i;
        for(; i < j; i++){
            if(nums[i] > nums[tem])tem = i;
        }
        return tem;
    }
}
