package com.company;
/**
 * @author christinaadanks
 * runtime: 7ms
 */

public class AddBinary {
    public static String addBinary (String a, String b)    {
        String result = "";
        int carry = 0;
        int sum = 0;
        int A = a.length() - 1, B = b.length() - 1;
        while (A >= 0 || B >= 0)    {
            if (A < 0)  {
                sum = ((b.charAt(B) - '0') + carry);
                B--;
            }
            else if (B < 0) {
                sum = ((a.charAt(A) - '0') + carry);
                A--;
            }
            else    {
                sum = ((a.charAt(A) - '0') + (b.charAt(B) - '0') + carry);
                A--;
                B--;
            }
            if (sum == 2)    {
                carry = 1;
                sum = 0;
            }
            else if (sum == 3)  {
                carry = 1;
                sum = 1;
            }
            else if (sum == 0 || sum == 1)  {
                carry = 0;
            }
            result += sum;
        }
        if (carry != 0) {
            result += carry;
        }
        String reverse = "";
        for (int i = result.length() - 1; i >= 0; i--)  {
            char c = result.charAt(i);
            reverse += c;
        }
        return reverse;
    }

    public static void main(String[] args) {
        //example test
        String a = "10101011";
        String b = "110101";
        System.out.println(addBinary(a, b));
    }
}
