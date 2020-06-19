package b_4_12;

public class MinCostToMoveChips {
    public int minCostToMoveChips(int[] chips) {
        int num1=0,num2=0;
        for(int i=0;i<chips.length;i++)
        {
            if(chips[i]%2==0)num1++;
            else num2++;
        }
        if(num1>num2)return num2;
        return num1;
    }
}
