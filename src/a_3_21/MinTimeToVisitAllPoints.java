package a_3_21;

/**
 * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
 * 你可以按照下面的规则在平面上移动：
 * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 * 必须按照数组中出现的顺序来访问这些点。
 */
public class MinTimeToVisitAllPoints {

    /**
     * 二维数字的使用
     * 每两点最短距离就是max(abs(y2-y1),abs(x2-x1))
     * @param points
     * @return
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int len=0;
        for(int i=0;i<points.length-1;i++){
            int x=points[i][0],y=points[i][1];
            int m=points[i+1][0],n=points[i+1][1];
            int a=Math.abs(m-x),b=Math.abs(n-y);
            if(a>b)len=len+a;
            else len=b+len;
        }
        System.out.println(len);
        return len;
    }
}
