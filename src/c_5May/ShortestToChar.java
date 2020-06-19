package c_5May;

/**
 *左右双指针的使用
 * 前后两个指针的更新
 */
public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
        int le=S.indexOf(C);
        int ri=le;
        int[] res=new int[S.length()];
        for(int i=0;i<S.length();i++){
            //前后两指针位置更新
            if(S.charAt(i)=='C'){
                res[i]=0;
                le=i;
                ri=S.indexOf(C,i+1);
            }
            else {
                res[i]=Math.min(Math.abs(le-i),Math.abs(ri-i));
            }
        }
        return res;
    }
}
