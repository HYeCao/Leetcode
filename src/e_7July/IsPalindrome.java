package e_7July;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0)return false;
        String str = String.valueOf(x);
        String res = new StringBuffer(str).reverse().toString();
        if(res.equals(str))return true;
        return false;
    }
}
