class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        if (target == 0 && nums[0] > 0)    {
            return 0;
        }
        
        for (int i = 0; i < nums.length; i++)   {
            if (nums[i] == target)  {
                return i;
            }
            else if (nums[i] != target && nums[i] > target)  {
                return i;
            }
            else if (nums[i] != target && nums[i] < target && i == nums.length - 1) {
                return i + 1;
            }
        }
        return 0;
    }
}
