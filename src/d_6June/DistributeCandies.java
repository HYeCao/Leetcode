package d_6June;

public class DistributeCandies {
    public static void main(String[] args) {
        distributeCandies(60,4);
    }
    public static int[] distributeCandies(int candies, int num_people) {
        int[] res=new int[num_people];
        int a=0;
        while(candies>0) {
            System.out.println(candies);
            for (int i = 1; i <= num_people; i++) {

                if(candies>a+i) {
                    res[i - 1] += a + i;
                    System.out.println("1 "+res[i - 1]);
                }
                else {
                    res[i-1]+=candies;
                    candies=0;
                    System.out.println("2 "+res[i-1]);
                    break;
                }
                candies-=i+a;
            }
            a+=num_people;
        }
        return res;
    }
}
/*
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while (candies != 0) {
            ans[i % num_people] += Math.min(candies, i + 1);
            candies -= Math.min(candies, i + 1);
            i += 1;
        }
        return ans;
    }
}
 */
