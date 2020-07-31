package e_7July;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {
    public static void main(String[] args) {
        int[][] test = new int[3][3];
        test[0][0] = 0;
        test[0][1] = 0;
        test[1][0] = 1;
        test[1][1] = 0;
        test[2][0] = 2;
        test[2][1] = 0;
        numberOfBoomerangs(test);
    }
    public static int numberOfBoomerangs(int[][] points) {
            int res = 0;
            for(int i = 0;i < points.length; i++){
                Map<Double, Integer> map = new HashMap<>();
                int tem = 0;
                for(int j = 0; j < points.length; j++){
                    if(i != j) {
                        map.put(distance(points, i, j), tem++);
                        System.out.print(i+"**"+map.get(distance(points, i, j))+" ");
                    }
                }
                System.out.println();
                for(Double a : map.keySet()){
                    if(map.get(a) > 1){
                        System.out.print(a+"++"+map.get(a)+" ");
                        res += get(map.get(a));
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println(res);
            return res;
    }
    public static double distance(int[][] points, int i, int j ){
        double dis = Math.pow((points[i][0] - points[j][0]), 2) + Math.pow((points[i][1] - points[j][1]), 2);
        return dis;
    }
    public static int get(int num){
        return num * (num - 1)/2;
    }
}
