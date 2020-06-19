package c_5May;

/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 */
public class Transpose {
    public int[][] transpose(int[][] A) {
        int[][] res=new int[A[0].length][A.length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                res[j][i]=A[i][j];
            }
        }
        return res;
    }
}
