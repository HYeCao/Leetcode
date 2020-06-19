package b_3_28;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 * 注意，当一组学生被选中时，他们之间可以以任何可能的方式重新排序，而未被选中的学生应该保持不动。
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<heights.length;i++){
            list.add(heights[i]);
        }
        Collections.sort(list);
        int res=0;
        for(int i=0;i<heights.length;i++){
            if(list.get(i)!=heights[i])res++;
        }
        return res;
    }
}
