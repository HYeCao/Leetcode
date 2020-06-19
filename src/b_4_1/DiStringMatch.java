package b_4_1;

/**
 * 我们维护当前未使用的最小和最大的数，它们对应的区间为当前未使用的数的集合。
 * 从左向右扫描字符串，如果碰到 'I'，就取出当前最小的数，否则取出当前最大的数。
 */
public class DiStringMatch {
    public int[] diStringMatch(String S) {
        int  x=0,y=S.length();
        int[] res=new int[S.length()+1];
        int i=0;
        for(;i<S.length();i++){
            if(S.charAt(i)=='I')res[i]=x++;
            else res[i]=y--;
        }
        res[i]=x;
        return res;
    }
}
