package b_3_28;

public class HammingWeight {
    public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);
        int len=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')len++;
        }
        return len;
    }
}
