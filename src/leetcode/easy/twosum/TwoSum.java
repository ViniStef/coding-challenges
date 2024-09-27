package leetcode.easy.twosum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Customize the array and the target here to see if it works for any case!
        int[] solutionArr = solution.twoSum(new int[]{3, 2, 4, 7, 14, 21}, 21);
        System.out.println(Arrays.toString(solutionArr));
    }

}