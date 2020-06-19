package b_3_30;

import java.util.ArrayList;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */
public class IsUnique {
    public boolean isUnique(String astr) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i< astr.length();i++) {
            if(list.contains(astr.charAt(i)))return false;
            else list.add(astr.charAt(i));
        }
            return true;
    }
}
