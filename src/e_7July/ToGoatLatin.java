package e_7July;

public class ToGoatLatin {
    public String toGoatLatin(String S) {
        //思路：1.先分割 2.对单个单词处理 3.做好结果字符串的处理
        String[] strs = S.split(" ");
        String res = new String();
        //思考使用switch case
        for(int i = 0; i < strs.length; i++){
            if(strs[i].charAt(0) == 'a' || strs[i].charAt(0) == 'A' || strs[i].charAt(0) == 'i' || strs[i].charAt(0) == 'I' || strs[i].charAt(0) == 'e' || strs[i].charAt(0) == 'E'
            || strs[i].charAt(0) == 'o' || strs[i].charAt(0) == 'O' || strs[i].charAt(0) == 'u' || strs[i].charAt(0) == 'U'){
                strs[i] += "ma";
                for(int a = -1; a < i; a++){
                    strs[i] += "a";
                }
                if(res.length() != 0)
                  res += " "+strs[i];
                else res = strs[i];
            }
            else {
                String tem = new String();
                for( int j = 1; j < strs[i].length(); j++){
                    tem += strs[i].charAt(j);
                }
                tem += strs[i].charAt(0);
                tem += "ma";
                for(int a = -1; a < i; a++){
                    tem += "a";
                }
                if(res.length() != 0)
                    res += " "+ tem;
                else res = tem;
            }
        }
        return res;
    }
}
/**
 * class Solution {
 *     public String toGoatLatin(String S) {
 *         Set<Character> vowel = new HashSet();//设定set来作为判别处理
 *         for (char c: new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'})
 *             vowel.add(c);
 *         int t = 1;
 *         StringBuilder ans = new StringBuilder();
 *         for (String word: S.split(" ")) {
 *             char first = word.charAt(0);
 *             if (vowel.contains(first)) {
 *                 ans.append(word);
 *             } else {
 *                 ans.append(word.substring(1));
 *                 ans.append(word.substring(0, 1));
 *             }
 *             ans.append("ma");
 *             for (int i = 0; i < t; i++)
 *                 ans.append("a");
 *             t++;
 *             ans.append(" ");
 *         }
 *         ans.deleteCharAt(ans.length() - 1);//去除结尾的一个空格
 *         return ans.toString();
 *     }
 * }
 */