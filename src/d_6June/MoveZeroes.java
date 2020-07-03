package d_6June;

public class MoveZeroes {
    /**
     * 模仿双指针
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];//先加到J J再++
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }

    /**
     * 双指针操作 一个按顺序 一个动态变化
     * @param nums
     */
    public void move(int[] nums){
        if(nums==null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
    }
}
