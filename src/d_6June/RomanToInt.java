package d_6June;

/**
 *字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * 	X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * 	C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class RomanToInt {
    public static void main(String[] args) {
        romanToInt("IV");
    }
    public static int romanToInt(String s) {
        int res=0;
        char[] chs=s.toCharArray();
        for(int i=0;i<chs.length;i++){
            System.out.println(res);
            if(chs[i]=='I'){
                if(i<chs.length-1){
                    if(chs[i+1]=='V'){
                        res+=4;
                        i++;
                    }else if(chs[i+1]=='X'){
                        res+=9;
                        i++;
                    }
                    else {
                        res+=1;
                    }
                }
                else {
                    res+=1;
                }
            }
            else  if(chs[i]=='V'){
                res+=5;
            }
            else  if(chs[i]=='X'){
                if(i<chs.length-1){
                    if(chs[i+1]=='L'){
                        res+=40;
                        i++;
                    }else if(chs[i+1]=='C'){
                        res+=90;
                        i++;
                    }
                    else {
                        res+=10;
                    }
                }
                else {
                    res+=10;
                }
            }
            else  if(chs[i]=='L'){
                res+=50;
            }
            else  if(chs[i]=='C'){
                if(i<chs.length-1){
                    if(chs[i+1]=='D'){
                        res+=400;
                        i++;
                    }else if(chs[i+1]=='M'){
                        res+=900;
                        i++;
                    }
                    else {
                        res+=100;
                    }
                }
                else {
                    res+=100;
                }
            }
            else  if(chs[i]=='D'){
                res+=500;
            }
            else  if(chs[i]=='M'){
                res+=1000;
            }
        }
        return res;
    }
}
/*
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
 */