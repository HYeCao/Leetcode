package f_8August;

import java.util.Arrays;

public class Average {
    public double average(int[] salary) {
        double res = 0;
        Arrays.sort(salary);
        for(int i = 1; i < salary.length - 1; i++){
            res += salary[i];
        }
        res = res/(salary.length - 2);
        return res;
    }
}
