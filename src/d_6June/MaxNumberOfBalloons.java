package d_6June;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(map.get(text.charAt(i))==null){
                map.put(text.charAt(i),1);
            }
            else {
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            }
        }
        if(map.get('a')==null||map.get('b')==null||map.get('l')==null||map.get('o')==null||map.get('n')==null)return 0;
        int a=map.get('a'),b=map.get('b'),l=map.get('l')/2,o=map.get('o')/2,n=map.get('n');
        if(a>b)a=b;
        if(a>l)a=l;
        if(a>o)a=o;
        if(a>n)a=n;
        return a;
    }
}
/*
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] result = new int[26];
        for(int i = 0; i < text.length(); i++)
        {
            result[(int)(text.charAt(i)) - 97]++;
        }
//        int b = result[('b' - 97)];
//        int a = result[('a' - 97)];
//        int l = result['l' - 97];
//        int o = result['o' - 97];
//        int n = result[('n' - 97)];
int count = 0;
        while(count < 10000)
        {
        result[('b' - 97)]--;
        result[('a' - 97)]--;
        result['l' - 97] -= 2;
        result['o' - 97] -= 2;
        result[('n' - 97)]--;
        if(result[('b' - 97)] < 0 || result[('a' - 97)] < 0 || result['l' - 97] < 0
        || result['o' - 97] < 0 || result[('n' - 97)] < 0)
        {
        return count;
        }
        count++;
        }
        return 0;
        }
        }
 */
