package hashtable;

import java.util.HashMap;

/**
 * @FileName: FourSumII454
 * @Description: Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return
 * the number of tuples (i, j, k, l) such that:
 * 0 <= i, j, k, l < n;
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0;
 * @Author: Spencer ZHAO
 * @Date: 8/2/2023
 */
public class FourSumII454 {
    
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>(nums1.length * nums2.length);
        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        int res = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                if (map.containsKey(-c - d)) {
                    res += map.get(-c - d);
                }
            }
        }
        return res;
    }
}
