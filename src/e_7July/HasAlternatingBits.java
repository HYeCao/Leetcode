package e_7July;


public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        for(int i = 0; i < Integer.toBinaryString(n).length()-1; i++){
            if(Integer.toBinaryString(n).charAt(i) == Integer.toBinaryString(n).charAt(i+1))return false;
        }
        return true;
    }
}
/*
位运算
思路分析：

{先通过int pre = n & 1获取第一位二进制的数字。在循环过程中如果发现当前位的数字与前一位相等(n & 1) == pre，就返回false}

判断某个数的二进制数相邻的两个位数永不相等。所以还是要按顺序知道它二进制数的每一位的数字是多少。参考191.只出现一次的数字的做法来获取每一位二进制数字。
这里需要拿当前位二进制的数字与前一位二进制的数字进行比较，所以在进入循环之前，先通过int pre = n & 1获取第一位二进制的数字。在循环过程中如果发现当前位的数字与前一位相等(n & 1) == pre，就返回false。
在循环中不断无符号右移n的同时，还要不断更新pre =  n & 1。
时间复杂度：O(1)O(1)O(1) 。运行时间依赖于数字n的位数。由于这题中n是 32 位数。空间复杂度是O(1)O(1)O(1)的。
public boolean hasAlternatingBits(int n) {
    boolean res = true;
    int pre = -1;
    while(n != 0){
        if(pre != -1 && pre == (n & 1)){
            res = false;
            break;
        }else{
            pre = n & 1;
            n = n >> 1;
        }
    }
    return res;
}
 */