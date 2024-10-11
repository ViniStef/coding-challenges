package leetcode.easy.plusone;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9,9})));
    }
}
