package d_6June;

import java.util.ArrayList;
import java.util.List;

/**
 * Push：从 list 中读取一个新元素， 并将其推入数组中。
 * Pop：删除数组中的最后一个元素。
 * 如果目标数组构建完成，就停止读取更多元素。
 */
public class BuildArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<String>();
        int a=0;
        for(int i=1;i<=n;i++){
            if(a>=target.length)break;
            if(target[a]>i){
                list.add("Push");
                list.add("Pop");
            }
            else if(target[a]==i){
                list.add("Push");
                a++;
            }
        }
        return list;
    }
}
