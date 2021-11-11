class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)   {
            return nums[0];
        }
        else    {
            int res = 0;
            for (int n : nums)  {
                res = res ^ n;
            }
            return res;
        }
    }
}
