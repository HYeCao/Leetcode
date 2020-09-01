package f_8August;

public class IsFlipedString {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.equals("") && s2.equals(""))return true;
        if(s1.length() != s2.length())return false;
        //解题思路：字符串二次连接，判断是否有相同的字段
        s2 = s2 + s2;
        for(int i = 0 ; i < s2.length(); i++){
            if(s2.charAt(i) == s1.charAt(0)){
                int j = i;
                boolean bol = true;
                for(int x = 0; x < s1.length(); x++){
                    if(j >= s2.length() || s1.charAt(x) != s2.charAt(j)){
                        bol = false;
                        x = s1.length();
                    }
                    j++;
                }
                if(bol == true)return true;
            }
        }
        return false;
    }
}
/**
 * public boolean isFlipedString(String s1, String s2) {
 *         // 长度不相等，肯定不符合要求
 *         if (s1.length() != s2.length()) {
 *             return false;
 *         }
 *         // 长度相等时，若s2是s1旋转而成的，那么把s2和自身拼接一次，s1就会出现在其中
 *         // "erbottlewat" + "erbottlewat" = erbottle waterbottle wat
 *     	// 如果s2不是s1旋转而成的，那么那么把s2和自身拼接一次，s1就肯定不会出现在其中
 *         return (s2 + s2).indexOf(s1) != -1;
 *     }
 */
