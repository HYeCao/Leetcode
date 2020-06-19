package b_4_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 给定长度为 2n 的数组,
 * 你的任务是将这些数分成 n 对,
 * 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        int  res=0;
        for(int i=0;i<list.size();i++){
            res+=list.get(i);
            i++;
        }
        return res;
    }
}
