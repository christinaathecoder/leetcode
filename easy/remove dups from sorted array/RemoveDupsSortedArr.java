/**
 * @author christinaathecoder
 * runtime: 1ms
 */

class RemoveDupsSortedArr {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++)   {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
