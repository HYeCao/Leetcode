package a_3_25;

/**
 * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
 *
 * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
 *
 * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
 *
 * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
 *
 * 矩阵与二维数据的设定！！
 * 一遍过 牛逼！！！
 */
public class OddCells {
    public static void main(String[] args) {
        int[][] ins={{2,3,1,4},{4,5,6,7},{6,7}};
        System.out.println(ins[2][1]);
        oddCells(1,2,ins);
    }
    public static int oddCells(int n, int m, int[][] indices) {
        int[][] res=new int[n][m];
        for(int i=0;i<indices.length;i++){
            for(int y=0;y<m;y++){
                res[indices[i][0]][y] ++;
            }
            for(int x=0;x<n;x++){
                res[x][indices[i][1]]++;
            }
        }
        int re=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(res[i][j]%2==1)re++;
            }
        }
        return re;
    }
}
