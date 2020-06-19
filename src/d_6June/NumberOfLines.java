package d_6June;

public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {
        char[] nums=S.toCharArray();
        int len=0,num=0,tem=0;
        for(int i=0;i<nums.length;i++){
            tem+=widths[nums[i]-'a'];
            if(tem>100){
                len++;
                i--;
                tem=0;
            }
            else if(tem==100){
                len++;
                tem=0;
            }
        }
        return new int[]{len+1,tem};
    }
}
