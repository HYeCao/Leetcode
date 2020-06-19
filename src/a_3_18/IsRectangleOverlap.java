/**
 * 
 */
package a_3_18;

/**
 * 矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。
 * 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。
 * 思路：逆向思维，判断什么情况下不重叠！！！ 以一条直线作为参照
 * 
 * @author caohongye
 *
 */
public class IsRectangleOverlap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 分情况考虑：三种情况 ：1 左下的点在里面 2 右上的点在里面 3 两个点都在里面（不用判断）
	 * 逆向思维：只判断不重叠的情况，左侧 上侧 右侧 下侧 一个直线来判断
	 * @param rec1
	 * @param rec2
	 * @return
	 */
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if(rec2[2]<=rec1[0])return false;
		if(rec2[1]>=rec1[3])return false;
		if(rec2[3]<=rec1[1])return false;
		if(rec2[0]>=rec1[2])return false;
		return true;
    }
}
