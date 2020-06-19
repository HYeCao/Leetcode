package b_4_1;

/**
 * 给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
 */
public class GenerateTheString {
    public String generateTheString(int n) {
        //偶数的情况
        String str=new String();
        if(n%2==0){
            for(int i=0;i<n-1;i++){
                str +="a";
            }
            str= str+"b";
        }
        //奇数的情况
        else{
            for(int i=0;i<n;i++){
                str +="a";
            }
        }
        return str;
    }
}
