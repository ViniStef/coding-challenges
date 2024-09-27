package leetcode.easy.twosum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int contador = 0; contador < nums.length; contador++) {
            for (int i = contador + 1; i < nums.length; i++) {
                if (nums[contador] + nums[i] == target) {
                    return new int[]{contador, i};
                }
            }
        }
        return new int[0];
    }
}
