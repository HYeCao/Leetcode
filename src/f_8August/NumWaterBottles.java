package f_8August;

public class NumWaterBottles {
    public static void main(String[] args) {
        numWaterBottles(9, 3);
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int res = 0;
        while(numBottles >= numExchange){
            res += numExchange;
            numBottles -= numExchange;
            numBottles += 1;
        }
        res += numBottles;
        System.out.println(res);
        return res;
    }
}
