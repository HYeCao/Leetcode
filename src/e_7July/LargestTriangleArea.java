package e_7July;

public class LargestTriangleArea {
    public static void main(String[] args) {
        int[][] re = new int[3][2];
        re[0][0] = 10; re[0][1] = 7;
        re[1][0] = 0; re[1][1] = 4;
        re[2][0] = 5; re[2][1] = 7;
        largestTriangleArea(re);
    }
    public static double largestTriangleArea(int[][] points) {
        double res = 0;
        for(int i = 0; i < points.length; i++){
            for(int j = i+1; j < points.length; j++)
                for(int k = j+1; k <points.length; k++){
                    res = Math.max(res, area(points[i], points[j], points[k]));
                }
        }
        return res;
    }
    public static double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
                -P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
    }
}
