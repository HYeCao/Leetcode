package e_7July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 比较字符串最小字母出现频次
 * 思路：map的使用
 * 优化：使用二分查找
 */
public class NumSmallerByFrequency {
    public static void main(String[] args) {
        String[] s1 = new String[1];
        s1[0] = "cbd";
        String[] s2 = new String[1];
        s2[0] = "zaaaz";
        numSmallerByFrequency(s1, s2);
    }
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] que = new int[queries.length];
        int[] wor = new int[words.length];
        int[] res = new int[que.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < que.length; i++){
            que[i] = get(queries[i]);
        }
        for(int i = 0; i < wor.length; i++){
            wor[i] = get(words[i]);
        }
        for(int i = 0; i < que.length; i++){
            int num = 0;
            for(int j = 0; j < wor.length; j++){
                if(que[i] < wor[j])num++;
            }
            res[i] = num;
        }
        return res;
    }
    public static int get(String str){
        Map<Integer, Integer> map = new HashMap<>();
        int num = Integer.MAX_VALUE;
        for(int i = 0; i < str.length(); i++){
            if(num > (int) str.charAt(i) - 96) num = (int) str.charAt(i) - 96;
            map.put((int) str.charAt(i) - 96,  map.getOrDefault((int) str.charAt(i) - 96,0) + 1);
        }
        System.out.println(map.get(num));
        return map.get(num);
    }

}
