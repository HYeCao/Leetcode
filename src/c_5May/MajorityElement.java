package c_5May;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null)map.put(nums[i],1);
            else map.put(nums[i],map.get(nums[i])+1);
            if(map.get(nums[i])>(nums.length/2))return nums[i];
        }
        return 0;
    }
}
