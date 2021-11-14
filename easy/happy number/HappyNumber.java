package com.company;

/**
 * @author christinaadanks
 * runtime: 0ms
 */

public class HappyNumber {
    public static boolean isHappy (int n)   {
        int num = n; //number to be tested
        int add = n; //added numbers
        int e = 0; //additions
        while (num > 0)    {
            if (num == 4)   { //anytime num hits 4 it won't be a happy number
                return false;
            }
            if (num == 1)   {
                return true;
            }
            if (add > 0)    {
                e += (int)Math.pow((add % 10), 2);
                add = add / 10;
            }
            else    {
                num = e;
                add = e;
                e = 0;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        int n = 19, m = 2;
        System.out.println(isHappy(n));
        System.out.println(isHappy(m));
    }
}
