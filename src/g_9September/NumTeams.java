package g_9September;

public class NumTeams {
    /**
     * 枚举来实现，一个一个元素来查
     * @param rating
     * @return
     */
    public int numTeams(int[] rating) {
        int res = 0;
        for(int i = 0; i < rating.length - 2; i++){
            for(int j = i + 1; j < rating.length - 1; j++){
                for(int k = j + 1; k < rating.length; k++){
                    if(rating[i] > rating[j] && rating[j] > rating[k])res++;
                    if(rating[i] < rating[j] && rating[j] < rating[k])res++;
                }
            }
        }
        return res;
    }
}
/*
class Solution {
    public int numTeams(int[] rating) {
        int i = 0;
        int count = 0;
        while (i < rating.length - 2)
        {
            for (int j = i + 1; j < rating.length - 1; j++)
            {
                if(rating[j] > rating[i])
                {
                    for (int k = j + 1; k < rating.length; k++)
                    {
                        if(rating[k] > rating[j])
                        {
                            count++;
                        }
                    }
                }
                if(rating[j] < rating[i])
                {
                    for (int k = j + 1; k < rating.length; k++)
                    {
                        if(rating[k] < rating[j])
                        {
                            count++;
                        }
                    }
                }
            }
            i++;
        }
        return count;
    }
}
 */