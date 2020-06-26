package d_6June;

public class RemovePalindromeSub {
    public int removePalindromeSub(String s) {
        if(s.length()==0)return 0;
        String end=new StringBuffer(s).reverse().toString();
        if(end.equals(s))return 1;
        return 2;
    }
}
/*
class Solution {
    public int removePalindromeSub(String s) {
        if ("".equals(s)) return 0;
        if (s.equals(new StringBuilder(s).reverse().toString())) return 1;
        return 2;
    }
}
 */