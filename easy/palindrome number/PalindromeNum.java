/**
 * @author christinaadanks
 * runtime: 6ms
 */

class PalindromeNum {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int i= 0;
        int p = x;
        if (x < 0)  {
            return false;
        }
        if (x == 0) {
            return true;
        }
        while (x != 0)  {
            i = x % 10;
            reverse = reverse * 10 + i;
            x = x/10;
            if (reverse == p)   {
                return true;
            }
        }
        return false;
    }
}
