package leetcode.easy.missingnumber;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 1;
            } else {
                return (nums[0]) == -1 ? 0 : nums[0] -1;
            }
        }

        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i-1] != (nums[i] - 1)) {
                return nums[i] -1 == -1 ? 0 : nums[i] -1;
            }
            if (nums[nums.length-1] != nums.length) {
                return nums.length;
            }
        }

        return (nums[0]) == -1 ? 0 : nums[0] -1;
    }
}

// Cool alternative solution, similar to my approach but way more refined
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//
//        // Case 1
//        if (nums[0] != 0) return 0;
//
//        // Case 2
//        if (nums[n - 1] != n) return n;
//
//        // Case 3
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != i) return i;
//        }
//
//        return 0;
//    }
//}