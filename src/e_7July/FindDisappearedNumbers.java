package e_7July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisappearedNumbers {
    /**
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1 );
        }
        for(int i = 1; i < nums.length + 1; i++){
            if(map.get(i) == null)list.add(i);
        }
        return list;
    }
}
/**
 * class Solution {
 *     public List<Integer> findDisappearedNumbers(int[] nums) {
 *         for (int i = 0; i < nums.length; i++) {
 *             int newIndex = Math.abs(nums[i]) - 1;
 *             if (nums[newIndex] > 0) {
 *                 nums[newIndex] *= -1;
 *             }
 *         }
 *         List<Integer> result = new LinkedList<Integer>();
 *         for (int i = 1; i <= nums.length; i++) {
 *             if (nums[i - 1] > 0) {
 *                 result.add(i);
 *             }
 *         }
 *         return result;
 *     }
 * }
 */
