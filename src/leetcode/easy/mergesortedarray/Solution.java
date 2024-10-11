package leetcode.easy.mergesortedarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2ItemCounter = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[nums2ItemCounter];
            nums2ItemCounter++;
        }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
