package d_6June;

import java.util.ArrayList;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c>nums.length*nums[0].length)return nums;
        int[][] res=new int[r][c];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                list.add(nums[i][j]);
            }
        }
        int a=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=list.get(a);
                a++;
            }
        }
        return res;
    }
}
