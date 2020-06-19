package b_4_8;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        for(int i=1;i<target-1;i++){
            int tem=0;
            ArrayList<Integer> list=new ArrayList<>();
            list.add(i);
            for(int j=i+1;j<target;j++){
                tem=i+j+tem;
                if(tem<target)list.add(j);
                else if(tem==target){
                    list.add(j);
                    lists.add(list);
                }
                else {
                    j=target;
                }
            }
        }
        int[][] res=new int[lists.size()][];
        for(int i=0;i<lists.size();i++){
           int[] tem=new int[lists.get(i).size()];
           for(int j=0;j<tem.length;j++){
               tem[j]=lists.get(i).get(j);
           }
           res[i]=tem;
        }
        return res;
    }
    /*
    class Solution {
    public int[][] findContinuousSequence(int target) {

        List<int[]> result = new ArrayList<>();
        int i = 1;

        while(target>0)
        {
            target -= i++;
            if(target>0 && target%i == 0)
            {
                int[] array = new int[i];
                for(int k = target/i, j = 0; k < target/i+i; k++,j++)
                {
                    array[j] = k;
                }
                result.add(array);
            }
        }
        Collections.reverse(result);
        return result.toArray(new int[0][]);
    }
}
     */
    //滑动窗口的使用
    public int[][] findContinuousSequence2(int target) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int sum = 0; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += j;
                j++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            } else {
                // 记录结果
                int[] arr = new int[j-i];
                for (int k = i; k < j; k++) {
                    arr[k-i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
