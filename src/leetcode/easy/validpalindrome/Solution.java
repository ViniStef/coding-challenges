package leetcode.easy.validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        s = s.toLowerCase();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (Character.isLetterOrDigit(s.charAt(leftPointer)) && Character.isLetterOrDigit(s.charAt(rightPointer))) {
                if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                    return false;
                }
                leftPointer++;
                rightPointer--;
            } else if (!Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return true;

    }

}
