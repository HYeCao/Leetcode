package c_5May;

public class TitleToNumber {
    public static void main(String[] args) {
        System.out.println('A'-'B');
        System.out.println(titleToNumber("ZY"));
    }
    public static int titleToNumber(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res += (s.charAt(i)-'A'+1)*Math.pow(26,s.length()-i-1);
        }
        return res;
    }
}
