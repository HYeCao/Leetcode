package a_3_25;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 */
public class HammingDistance {
    public static void main(String[] args) {
        int x=1,y=4;
        hammingDistance(x,y);
    }

    /**
     * 换个思路：根据以上定义，提出一种 XOR 的位运算，当且仅当输入位不同时输出为 1。
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y) {
        return  Integer.bitCount(x ^ y);
    }
}
