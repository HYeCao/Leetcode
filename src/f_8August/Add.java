package f_8August;

public class Add {
    /**
     * 无进位和 与 异或运算 规律相同，进位 和 与运算 规律相同
     * {n=a⊕b  非进位和：异或运算
     * {c=a&b<<1​进位:与运算+左移一位​
     * （和 sss ）===（非进位和 nnn ）+++（进位 ccc ）。即可将 s=a+bs = a + bs=a+b 转化为：
     *  s=a+b⇒s=n+c
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        while(b != 0){
            int c = (a & b) << 1;//进位:与运算+左移一位​
            a ^= b; //非进位和：异或运算
            b = c; //获取最新移位结果
        }
        return a;
    }
}
/*
    public int add(int a, int b) {
        if(b == 0) {
            return a;
        }
        return add(b^a, (a&b)<<1);
    }
*/