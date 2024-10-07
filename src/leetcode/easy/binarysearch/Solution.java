package leetcode.easy.binarysearch;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int value = nums[middle];
            if (value > target) {
                end = middle - 1;
            } else if (value < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}