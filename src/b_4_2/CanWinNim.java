package b_4_2;

public class CanWinNim {
    public static void main(String[] args) {
        System.out.println(5%2+" "+5%1+" "+5%3);
    }
    public boolean canWinNim(int n) {

        return  (n % 4 != 0);
    }
}
