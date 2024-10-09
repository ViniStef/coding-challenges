package leetcode.easy.longestcommonprefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        // Change the value here to test different cases.
//        String response = solution.longestCommonPrefix(new String[]{"cir","car"});

        Solution2 solutionAttempt2 = new Solution2();
        String response = solutionAttempt2.longestCommonPrefix(new String[]{"ab", "a"});

        System.out.println(response);

    }
}
