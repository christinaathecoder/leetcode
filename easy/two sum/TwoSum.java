/**
 * @author christinaadanks
 * runtime: 1ms
 */

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)   {
            if (numMap.containsKey(nums[i]))    {
                int[] newNums = {numMap.get(nums[i]), i};
                return newNums;
            }
            else    {
                numMap.put(target - nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
