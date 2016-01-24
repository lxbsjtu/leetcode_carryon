package Banker;

import java.util.Arrays;

/**
 * Created by lxb on 16/1/24.
 */
public class FindMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k = (m + n);
        if (k % 2 ==1)
            return findK(nums1, m, nums2, n,  k/ 2 + 1);
        else
            return (findK(nums1, m, nums2, n, k / 2 + 1)
                    + findK(nums1, m, nums2, n, k / 2 )) / 2;
    }



    private static double findK(int[] nums1, int m, int[] nums2, int n, int k){
        if(m > n) return findK(nums2, n, nums1, m, k);

        if(m == 0){
            return nums2[k - 1];
        }

        if(k == 1){
            return (nums1[0] < nums2[0]) ? nums1[0] : nums2[0];
        }


        int index1 = Math.min(k/2, m);
        int index2 = k - index1;

        if(nums1[index1 - 1] < nums2[index2 - 1])
            return findK(Arrays.copyOfRange(nums1, index1, m), m - index1,
                    nums2, n, k - index1);

        else if(nums1[index1 - 1] > nums2[index2 - 1])
            return findK(nums1, m,Arrays.copyOfRange(nums2, index2, n),
                    n - index2, k - index2);
        else
            return (double)nums1[index1 - 1];


    }
}

