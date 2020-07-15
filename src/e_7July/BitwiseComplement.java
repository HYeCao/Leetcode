package e_7July;

public class BitwiseComplement {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,2));
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.parseInt("0101010",2));
    }
    public int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        String res =  new String();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0')res += '1';
            else res += '0';
        }
        return Integer.parseInt(res,2);
    }
}
/**
 * XOR操作
 * class Solution {
 *     public int bitwiseComplement(int N) {
 *         if(N == 0){
 *             return 1;
 *         }
 *         int len = N;
 *         int countBit = 0;
 *         while(len > 0){
 *             countBit++;
 *             len = len >> 1;
 *         }
 *
 *         int allOne = (int)Math.pow(2, countBit) - 1;
 *         return allOne ^ N;
 *     }
 * }
 */
/**
 * 解题思路
 * 1.将N转化为二进制字符串
 * 2.得到字符串的长度_len
 * 3.得到与N长度相同，但是每一位都是1的数M
 * 4.M与N异或即为结果
 *
 class Solution {
 public int bitwiseComplement(int N) {
 String str = Integer.toBinaryString(N);
 int _len = str.length();
 int M = (int)Math.pow(2,_len) - 1;
 int result = M^N;
 return result;
 }
 }
 */