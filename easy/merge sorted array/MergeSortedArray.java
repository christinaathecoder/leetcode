package com.company;

/**
 * @author christinaadanks 
 */

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1; //total len of merged array
        int k = m - 1;
        int p = n - 1;

        while (len >= 0 && p >= 0)    {
            if (k >= 0 && nums1[k] >= nums2[p])    {
                nums1[len] = nums1[k];
                nums1[k] = 0;
                k--;
                len--;
            }
            else if (k < 0 || nums1[k] < nums2[p])  {
                nums1[len] = nums2[p];
                p--;
                len--;
            }
            else    {
                break;
            }
        }
    }
    public static void main (String[] args) {
        int[] nums1 = new int[] {0};
        int m = 0;
        int[] nums2 = new int[] {1};
        int n = 1;

        int[] nums3 = new int[] {1,1,2,5,6,0,0,0}, nums4 = new int[] {2,3,4};
        int j = 5, k = 3;
        merge(nums1, m, nums2, n);
        merge(nums3, j, nums4, k);
        for (int x : nums1) {
            System.out.print(x);
        }
        System.out.print("\n");
        for (int a : nums3) {
            System.out.print(a);
        }
    }
}
