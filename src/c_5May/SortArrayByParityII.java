package c_5May;

/**
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 你可以返回任何满足上述条件的数组作为答案。
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int a=0,b=1;
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                res[a]=A[i];
                a=a+2;
            }
            else{
                res[b]=A[i];
                b=b+2;
            }
        }
        return res;
    }
}
