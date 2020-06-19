package d_6June;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给你一个整数 n 。请你先求出从 1 到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加），然后把数位和相等的数字放到同一个组中。
 * 请你统计每个组中的数字数目，并返回数字数目并列最多的组有多少个。
 */
public class CountLargestGroup {
    public static void main(String[] args) {
        countLargestGroup(13);
    }
    public static int countLargestGroup(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int len=0;
        for(int i=1;i<=n;i++){
            if(map.get(get(i))==null){
                map.put(get(i),1);
            }
            else {
                map.put(get(i),map.get(get(i))+1);
            }
            if(map.get(get(i))>len){
                len=map.get(get(i));
            }
        }
        int res=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(len==entry.getValue()){
                res++;
            }
        }
        System.out.println(res);
        return res;
    }
    public static int get(int x){
        String str=String.valueOf(x);
        int res=0;
        for(int i=0;i<str.length();i++){
            res+=Integer.valueOf(str.charAt(i))-48;
        }
        return res;
    }
}
