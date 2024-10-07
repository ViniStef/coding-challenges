package leetcode.easy.seachinsertposition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] != target && nums[0] < target) {
                return 1;
            }
            return 0;
        }
        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int value = nums[middle];

            if (value < target) {
                start = middle + 1;
            } else if (value > target) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return start;
    }
}
