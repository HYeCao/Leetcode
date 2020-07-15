package e_7July;

import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for(int i = 0; i < k; i++){
            grid = transfer(grid);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < grid.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
            }
            res.add(list);
        }
        return res;
    }
    public int[][] transfer(int[][] grid){
        int[][] res = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                res[i][j + 1] = grid[i][j];
            }
            if (i < grid.length - 1) {
                res[i + 1][0] = grid[i][grid[0].length - 1];
            }
        }
        res[0][0] = grid[grid.length -1][grid[0].length -1];
        return res;
    }
}
