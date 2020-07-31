package e_7July;

public class MaxPower {
    public int maxPower(String s) {
        int res = 1;
        char tem = s.charAt(0);
        int num = 1;
        for(char ch : s.toCharArray()){
            if(ch == tem)num++;
            else {
                if(num > res)res = num;
                num = 0;
                tem = ch;
            }
        }        if(num > res)res = num;

        return res;
    }
}
