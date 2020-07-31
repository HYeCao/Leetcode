package e_7July;

public class ReplaceSpaces {
    public String replaceSpaces(String S, int length) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < length; i++){
            if(S.charAt(i) == ' '){
                res.append("%20");
            }
            else res.append(S.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println("sssaaa sssccc".replaceAll(" ", "%20"));
    }
}
/**
 * 运行报错
 *  String res = new String();
 *         for(int i = 0; i < length; i++){
 *             if(S.charAt(i) == ' '){
 *                 res += "%20";
 *             }
 *             else res+=S.charAt(i);
 *         }
 *         return res;
 */
/**正常运行 直接调用replaceAll方法
 * class Solution {
 *     public String replaceSpaces(String S, int length) {
 *         return S.substring(0, length).replaceAll(" ", "%20");
 *     }
 * }
 **/