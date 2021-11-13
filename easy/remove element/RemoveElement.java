/**
 * @author christinaadanks
 * runtime: 0ms
 */

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        int b = 0;
        while (a < nums.length) {
            if (nums[a] != val) {
                nums[b] = nums[a];
                b++;
            }
            a++;
        }
        return b;
    }
}
