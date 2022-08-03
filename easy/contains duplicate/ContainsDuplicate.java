package com.company;

/**
 * @author christinaathecoder
 * runtime: 768ms (need better solution)
 */

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int value = 0; //value to check for
        int i = 0; //position of value
        while (i < nums.length) {
            value = nums[i];
            for (int x = i + 1; x < nums.length; x++)  {
                if (nums[x] == value) {
                    return true;
                }
            }
            i++;
        }
        return false;
    }
    public static void main (String[] args) {
        int[] nums = new int[]{1,2,3,1}, nums2 = new int[]{1,1,1,3,3,4,3,2,4,2}, nums3 = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
