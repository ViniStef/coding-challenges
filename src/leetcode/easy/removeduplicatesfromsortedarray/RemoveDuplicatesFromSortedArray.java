package leetcode.easy.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
//        int result = solution.removeDuplicates(new int[]{1,1,1,2});

        System.out.println(result);
    }
}
