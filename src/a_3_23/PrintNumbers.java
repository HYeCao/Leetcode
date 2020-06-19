package a_3_23;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        if(n==0)return null;
        int max=0;
        if(n==1)max=10;
        if(n==2)max=100;
        if(n==3)max=1000;
        if(n==4)max=10000;
        if(n==5)max=100000;
        if(n==6)max=1000000;
        int[] nums=new int[max-1];
        for(int i=1;i<max;i++){
            nums[i]=i;
        }
        return nums;
    }
}
