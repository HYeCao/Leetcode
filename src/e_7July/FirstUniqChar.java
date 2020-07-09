package e_7July;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        firstUniqChar("leetcode");
    }
    public static char firstUniqChar(String s) {
        if(s.length()==0)
            return ' ';
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch: s.toCharArray()){
            System.out.println(ch);
            map.put(ch, map.getOrDefault(ch,0)+1);
            System.out.println(map.get(ch));
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Character mapKey = entry.getKey();
            Integer mapValue = entry.getValue();
            if(mapValue == 1)return mapKey;
        }
        return ' ';
    }
}
/**
 * 有序哈希表：
 * 在哈希表的基础上，有序哈希表中的键值对是 按照插入顺序排序 的。基于此，可通过遍历有序哈希表，实现搜索首个 “数量为 111 的字符”。
 * 哈希表是 去重 的，即哈希表中键值对数量 ≤\leq≤ 字符串 s 的长度。因此，相比于方法一，方法二减少了第二轮遍历的循环次数。当字符串很长（重复字符很多）时，方法二则效率更高。
 *
 * class Solution {
 *     public char firstUniqChar(String s) {
 *         Map<Character, Boolean> dic = new LinkedHashMap<>();
 *         char[] sc = s.toCharArray();
 *         for(char c : sc)
 *             dic.put(c, !dic.containsKey(c));
 *         for(Map.Entry<Character, Boolean> d : dic.entrySet()){
 *            if(d.getValue()) return d.getKey();
 *         }
 *         return ' ';
 *     }
 * }
 */
