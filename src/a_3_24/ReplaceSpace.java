package a_3_24;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        String str=new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')str=str+"%20";
            else str=str+s.charAt(i);
        }
        return str;
    }
}
