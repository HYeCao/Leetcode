package b_4_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。
 * 幸运数是指矩阵中满足同时下列两个条件的元素：
 * 	在同一行的所有元素中最小
 * 	在同一列的所有元素中最大
 * 	找出每一行的最小数 再找出每一列的最大数
 */
public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] matrix={{1,2},{1,0}};
        luckyNumbers(matrix);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int[] x=new int[matrix.length];
        int[] y=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            int temp=matrix[i][0];;
            for(int j=0;j<matrix[i].length;j++){
                if(temp>matrix[i][j])temp=matrix[i][j];
            }
            x[i]=temp;
        }
        for(int i=0;i<matrix[0].length;i++){
            int temp=matrix[0][i];;
            for(int j=0;j<matrix.length;j++){
                if(temp<matrix[j][i])temp=matrix[j][i];
            }
            y[i]=temp;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(x[i]==y[j])list.add(x[i]);
            }
        }
        return list;
    }
}
