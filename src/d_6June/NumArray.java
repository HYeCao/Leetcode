package d_6June;

public class NumArray {
    int[] Nums;
    public NumArray(int[] nums) {
        Nums=nums;
    }

    public int sumRange(int i, int j) {
        int res=0;
        for(int a=i;a<j+1;a++){
            res+=Nums[a];
        }
        return res;
    }
}
