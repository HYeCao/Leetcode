package a_3_25;

import java.util.Arrays;

/**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * 请返回你可以得到的最大数字。
 */
public class Maximum69Number {

    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        char[] chs=str.toCharArray();
        for(int i=0;i< str.length();i++){
            if(chs[i]=='6'){
                chs[i]='9';
                break;
            }
        }
        str=new String();
        for(char ch:chs){
            str +=ch;
        }
        return Integer.valueOf(str);
    }
}
