package f_8August;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int a5 = 0, a10 = 0, a20 = 0;
        for(int i = 0 ; i < bills.length; i++){
            if(bills[i] == 5)a5++;
            else if(bills[i] == 10){
                a5--;
                a10++;
            }
            else {
                a20++;
                if(a10 > 0){
                    a10--;
                    a5--;
                }else {
                    a5 = a5-3;
                }
            }
            if(a5 < 0 || a10 <0){
                return false;
            }
        }
        return true;
    }
}
