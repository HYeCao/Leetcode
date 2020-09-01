package f_8August;

public class DetectCapitalUse {

    public static void main(String[] args) {
        detectCapitalUse("g");
    }
    /**
     * 对于分类讨论的字符串问题：1. 理清多种情况 2. 注意特殊情况 3. 逐个解决
     * @param word
     * @return
     */
    public static boolean detectCapitalUse(String word) {
        if(AllDX(word) == true)return true;
        if(AllXX(word) == true)return true;
        return judge(word);
    }
    public static boolean AllDX(String word){
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) < 'A' || word.charAt(i) >'Z'){
                System.out.println("ALLDX false");
                return false;
            }
        }
        System.out.println("ALLDX true");
        return true;
    }
    public static boolean AllXX(String word){
        for(int i = 0 ; i < word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                System.out.println("AllXX false");
                return false;
            }
        }
        System.out.println("AllXX true");
        return true;
    }
    public static boolean judge(String word){
        char ch = word.charAt(0);
        if(ch < 'A' || ch > 'Z'){
            System.out.println("judge false");
            return false;
        }
        for(int i = 1; i< word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                System.out.println("judge false");
                return false;
            }
        }
        System.out.println("judge true");
        return true;
    }
}
