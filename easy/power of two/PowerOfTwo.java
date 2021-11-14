package com.company;

/**
 * @author christinaadanks 
 * runtime: 2ms
 */

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n)   {
        if (n == 1) { //2^0 case
            return true;
        }
        if (n % 2 != 0) { //negatives automatically false
            return false;
        }
        int i = 0; //keep track of exponents
        
        //search through powers to see if they're = n
        while ((int)Math.pow(2, i) <= n) {
            if ((int)Math.pow(2, i) == n)   {
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main (String[] args) {
        int n = 16, m = 3, j = 4, k = 1;
        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfTwo(m));
        System.out.println(isPowerOfTwo(j));
        System.out.println(isPowerOfTwo(k));
    }
}
