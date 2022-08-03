package com.company;
import java.util.ArrayList;
import java.util.List;

/**
 * @author christinaathecoder 
 * runtime: 6ms
 */

public class SummaryRanges {
    public static List<String> summaryRanges (int[] nums)   {
        List<String> result = new ArrayList<String>();

        //base cases
        if (nums.length == 0)   {
            return result;
        }
        if (nums.length == 1)  {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        int i = 0, len = nums.length;
        int k = 1; //increment

        while (i < len) {
            int start = nums[i]; //starting point
            int end = nums[i]; //ending point

            //while range increments by 1
            while (i + 1 < len && nums[i + 1] == nums[i] + 1) {
                i++;
                end = nums[i];
            }
            
            //add values to list
            String a = String.valueOf(start);
            if (start == end) {
                result.add(a);
            }
            else {
                String b = String.valueOf(end);
                result.add(a + "->" + b);
            }
            i++;
        }
        return result;
    }
    public static void main (String[] args) {
        int[] nums = new int[]{0,1,2}, nums2 = new int[]{0,2,3,4,6,8,9}, nums3 = new int[]{-1}, empty = new int[]{};
        System.out.println(summaryRanges(nums));
        System.out.println(summaryRanges(nums2));
        System.out.println(summaryRanges(nums3));
        System.out.println(summaryRanges(empty));
    }
}
