/**
 * @author christinaadanks
 * runtime: 1ms
 */

public class MaximumSubarray {
    public static int maxSubArray(int[] nums)  {
        int start = 0; //start of max subarray
        int end = 0; //end of max subarray

        int max = nums[0], maxEnd = nums[0]; //start at the beginning

        if (nums.length == 1)   { //if only one number, return that
            return max;
        }

        for (int i = 1; i < nums.length; i++)   {
            if (nums[i] > maxEnd + nums[i]) {
                start = i;
                maxEnd = nums[i];
            }
            else    {
                maxEnd += nums[i];
            }

            //if current max is less than new max, set max = new max
            if (max < maxEnd)   {
                max = maxEnd;
                end = i;
            }
        }
        return max;
    }

    public static void main (String[] args) {
        //test case
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
