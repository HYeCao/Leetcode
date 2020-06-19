package d_6June;

public class SurfaceArea {
    /**
     * 由于存在空洞现象所以无法通过三视图进行处理
     * @param grid
     * @return
     */
//    public int surfaceArea(int[][] grid) {
//        int res=0;
//        int up=0;
//        //(fore + up + left)*2
//        for(int i=0;i<grid.length;i++){
//            int tem=grid[i][0];
//            for(int j=0;j<grid[i].length;j++){
//                if(grid[i][j]!=0)up++;
//                if(tem<grid[i][j])tem=grid[i][j];
//            }
//            res+=tem;
//        }
//        res+=up;
//        for(int i=0;i<grid[0].length;i++){
//            int tem=grid[0][i];
//            for(int j=0;j<grid.length;j++){
//                if(grid[j][i]!=0)up++;
//                if(tem<grid[j][i])tem=grid[j][i];
//            }
//            res+=tem;
//        }
//        return res*2;
//    }

    public int surfaceArea(int[][] grid) {
        int N = grid.length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 上边露出的表面积
                res += i-1 >= 0 ? Math.max(grid[i][j] - grid[i-1][j], 0) : grid[i][j];
                // 下边露出的表面积
                res += i+1 < N ? Math.max(grid[i][j] - grid[i+1][j], 0) : grid[i][j];
                // 左边露出的表面积
                res += j-1 >= 0 ? Math.max(grid[i][j] - grid[i][j-1], 0) : grid[i][j];
                // 右边露出的表面积
                res += j+1 < N ? Math.max(grid[i][j] - grid[i][j+1], 0) : grid[i][j];
                // 顶部、底部的表面积
                res += 2 * (grid[i][j] > 0 ? 1 : 0);
            }
        }
        return res;
    }
}
