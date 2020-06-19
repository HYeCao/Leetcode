package b_4_6;

import java.util.ArrayList;

public class CheckPermutation {
    /**
     * int[256]的使用
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        int[] jud=new int[256];
        for(int i=0;i<s1.length();i++){
            jud[s1.charAt(i)]++;
        }
        for(int j=0;j<s2.length();j++){
            if(jud[s2.charAt(j)]==0)return false;
            else jud[s2.charAt(j)]--;
        }
        return true;
    }
}
