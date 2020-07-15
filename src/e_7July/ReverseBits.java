package e_7July;

import javax.swing.*;
import java.math.BigInteger;

public class ReverseBits {
    public static void main(String[] args) {
    }
    public static int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            res = (res << 1) + (n & 1);//左移一位填补上 n 的最右一位
            n >>= 1; // n 向左移
        }
        return res;
    }
}
