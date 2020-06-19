package a_3_24;

/**
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 返回可以通过分割得到的平衡字符串的最大数量。
 *输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 */
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int judge=0;
        int temp=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') judge++;
                else if (s.charAt(i) == 'R') judge--;
                if (judge == 0) {
                    temp++;
                    judge=0;
                }
        }
        return temp;
    }
}
