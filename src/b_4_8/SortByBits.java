package b_4_8;

import java.net.Inet4Address;
import java.util.*;

/**
 * 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
 *
 * 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
 *
 * 请你返回排序后的数组。
 */
public class SortByBits {
    public static void main(String[] args) {
//        int[] res={1024,512,256,128,64,32,16,8,4,2,1};
        int[] res={10000,10000};
        sortByBits(res);
    }
    public static int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(get(arr[i])>get(arr[j])){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else if(get(arr[i])==get(arr[j])){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        return arr;
    }
    public static int get(int num) {
        int time = 0;
        String str=Integer.toBinaryString(num);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')time++;
        }
        return time;
    }
}
