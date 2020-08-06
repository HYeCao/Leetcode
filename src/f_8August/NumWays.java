package f_8August;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 传递信息：0 - n-1 是否可以传到
 * 思路：先选择好的数据结构来进行存储 随后进行遍历处理（循环/DP）
 * 其实就是有向图中找符合条件的路径 DFS
 */
public class NumWays {
    static int tem;
    static int count;
    public static void main(String[] args) {
        int[][] nums ={{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        numWays(5, nums, 3);
    }
    public static int numWays(int n, int[][] relation, int k) {
        //用来存储 起点 + 可达点
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        tem = n;
        for(int i = 0; i < relation.length; i++){
            if(map.get(relation[i][0]) == null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(relation[i][1]);
                map.put(relation[i][0], list);
            }
            else {
                ArrayList<Integer> list = map.get(relation[i][0]);
                list.add(relation[i][1]);
                map.put(relation[i][0], list);
            }
        }
        count = 0;
        judge(0, map,k);
        System.out.println(count);
        return count;
    }

    /**
     * 思路：直接递归来处理 怎么递过去 怎么回来，处理返回值
     * 此解法递归总结，递归尽量就void，然后获取的值就全局变量来处理！！
     * @param x
     * @param map
     * @param k
     * @return
     */
    public static void judge(int x, Map<Integer, ArrayList<Integer>> map, int k){
        System.out.println(x+" "+k+" "+tem);
        if(k ==0){
            if(x == tem -1) {
                count++;
            }
            return ;
        }
        else {
            boolean bol = false;
            ArrayList<Integer> list = map.get(x);
            if(list == null)return ;
            for(int a : list){
                judge(a, map, k-1);
            }
        }
    }
}
