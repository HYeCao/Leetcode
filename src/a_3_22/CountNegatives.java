package a_3_22;

/**
 * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
 * 请你统计并返回 grid 中 负数 的数目。
 */
public class CountNegatives {
    public int countNegatives(int[][] grid) {
        int num=0;
        for(int i=grid.length-1;i>=0;i--){
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]<0)num++;
                else j=-1;
            }
        }
        return num;
    }
}
