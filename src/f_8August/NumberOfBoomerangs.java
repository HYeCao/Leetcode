package f_8August;

import java.util.HashMap;
import java.util.Map;

/**
 * 思路：每次一一个为基准点，然后获取所有其他点到它的距离。以相同距离的点来获取其所有的可能组合
 * 以此循环，遍历基准点
 */
public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[][] nums = {{0,0},{1,0},{-1,0},{0,1},{0,-1}};
        numberOfBoomerangs(nums);
    }
    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for(int i = 0; i < points.length; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                if(i != j) {
                    //获取当前两点的距离
                    int key = get(points[i][0], points[i][1], points[j][0], points[j][1]);
                    //以当前距离为key，递增次数+1
                    if (map.get(key) == null) {
                        map.put(key, 1);
                    } else {
                        map.put(key, map.get(key) + 1);
                    }
                }
            }
            for(int key : map.keySet()){
                if(map.get(key) >= 2){
                    res += map.get(key)*( map.get(key) - 1);//此处思路：结合了排列组合的思路 An m 的处理全排列
                }
            }
        }
        System.out.println("res : "+res);
        return res;
    }
    public static int get(int x, int y, int a, int b){
        return Math.abs((x - a) * (x - a)) +Math.abs((y - b)*(y - b));
    }
}
