package e_7July;

public class GetNoZeroIntegers {
    public static void main(String[] args) {
        System.out.println(9876/100);
    }
    /**
     * 思路：动态规划思想，循环进行处理
     * @param n
     * @return
     */
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1; i < n; i++){
            if(judge(i)&&judge(n-i))return new int[]{i,n-i};
        }
        return null;
    }
    public boolean judge(int num){
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')return false;
        }
        return true;
    }
}
