/**
 * @author christinaathecoder
 * runtime: 0ms
 */

class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int count = 0;
        if (digits[len] != 9)   {
            digits[len] = (digits[len] + 1);
            return digits;
        }
        else if (digits[len] == 9)    {
            int[] r = new int[digits.length + 1];
            r[0] = 1;
            for (int i = 0; i <= len; i++)   {
                if (digits[i] == 9) {
                    count++;
                }
                if (count == digits.length) {
                    for (int j = 1; j < r.length; j++)  {
                        r[j] = 0;
                    }
                    return r;
                }
                if (count != digits.length && i == len) {
                    for (int k = len; k >= 0; k--)  {
                        if (digits[len] == 9 || digits[k] == 10) {
                            digits[k] = 0;
                            digits[k - 1] = digits[k - 1] + 1;
                        }
                        else    {
                            break;
                        }
                    }
                    return digits;
                }
            }
        }
        return digits;
    }
}
