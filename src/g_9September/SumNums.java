package g_9September;

/**
 * 以逻辑运算符 && 为例，对于 A && B 这个表达式，如果 A 表达式返回 False\textit{False}False ，那么 A && B 已经确定为 False\textit{False}False ，此时不会去执行表达式 B。
 * 同理，对于逻辑运算符 ||， 对于 A || B 这个表达式，如果 A 表达式返回 True\textit{True}True ，那么 A || B 已经确定为 True\textit{True}True ，此时不会去执行表达式 B。
 */
public class SumNums {
    public static void main(String[] args) {
        System.out.println(sumNums(5));
    }
    public static int sumNums(int n) {
        boolean falg = n > 0 && (n += sumNums(n - 1))>0;
        return n;
    }
}
