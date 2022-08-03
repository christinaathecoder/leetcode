package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author christinaathecoder
 * runtime: 9ms
 */

public class MajorityElement {
    public static int majorityElement(int[] nums)   {
        int majority = nums.length / 2; //get majority length
        //hashmap to store number & how many times it occurs
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++)   {
            int k = nums[i];
            counter.put(k, counter.getOrDefault(k, 0) + 1); //increment counter
            if (counter.get(k) > majority)  {
                return k;
            }
        }
        return 0;
    }

    public static void main (String[] args) {
        int[] nums = new int[] {2,2,1,3,1,1,4,1,1,5,1,1,6}, nums2 = new int[] {2,2,1,1,1,2,2,};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums2));
    }
}
