package b_4_3;

/**
 * int[26]的使用
 */
public class CountCharacters {
    public static void main(String[] args) {
        countCharacters(null,"a");
    }
    public static int countCharacters(String[] words, String chars) {
        int[] chas=new int[26];
        for(int i=0;i<chars.length();i++){
            chas[chars.charAt(i)-'a']+=1;
        }
        int res=0;
        for(int i=0;i<words.length;i++){
            int[] chs=new int[26];
            for(int j=0;j<words[i].length();j++){
                chs[words[i].charAt(j)-'a']+=1;
            }
            boolean tem=true;
            for(int a=0;a<26;a++){
                if(chs[a]>chas[a]){
                    a=26;
                    tem=false;
                }
            }
            if(tem==true)
            res+=words[i].length();
        }
        return res;
    }
}
