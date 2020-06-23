package d_6June;

/**
 * 思路：递归 + 通分
 */
public class Fraction {
    public int[] fraction(int[] cont) {

        return get(cont,0);
    }
    public int[] get(int[] cont,int num){
        if(num==cont.length-1){
            return new int[]{1*cont[num],1};
        }
        int[] nextRes = get(cont, num+1);
        return new int[]{cont[num] * nextRes[0] + nextRes[1], nextRes[0]};
    }
}
