package d_6June;

import java.util.ArrayList;
import java.util.List;

public class Exchange {
    public int[] exchange(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)list2.add(nums[i]);
            else list1.add(nums[i]);
        }
        list1.addAll(list2);
        int[] arr1 = list1.stream().mapToInt(Integer::valueOf).toArray();
        return arr1;
    }
}
