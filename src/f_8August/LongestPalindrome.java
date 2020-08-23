package f_8August;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(7/2);
    }
    public int longestPalindrome(String s) {
        int[] jud = new int[128];
        for(int  i = 0; i < s.length(); i++){
            jud[s.charAt(i)]++;
        }
        int res = 0;
        boolean bol = false;
        for(int i = 0; i < jud.length; i++){
            int j = jud[i] / 2;
            if(bol == false && jud[i] % 2 != 0)bol = true;
            res += j*2;
        }
        if(bol == true)return res+1;
        return res;
    }
}
