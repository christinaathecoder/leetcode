/**
 * @author christinaadanks
 */
public class ClimbingStairs {
    public static int climbStairs(int n)   {
        //array for combinations
        int[] arr = new int[n + 1];

        arr[0] = 1; //case for 0 steps, 1 combination
        arr[1] = 1; //case for 1 step, 1 combination
        for (int i = 2; i < arr.length; i++)    {
            arr[i] = arr[i - 1] + arr[i - 2]; //use solved sub-problems
        }
        return arr[n];
    }
    
    public static void main (String args[]) {
        //test case
        int n = 44;
        System.out.println(climbStairs(n));
    }
}
