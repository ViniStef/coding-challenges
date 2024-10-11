package leetcode.easy.validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        s = s.toLowerCase();

        int leftPointer = 0;
        int rightPointer = s.length()-1;
        String allowedCharacters = "abcdefghijklmnopqrstuvwxyz0123456789";

        while (leftPointer < rightPointer) {
            if (allowedCharacters.contains(Character.toString(s.charAt(leftPointer))) && allowedCharacters.contains(Character.toString(s.charAt(rightPointer)))) {
                if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                    return false;
                }
                leftPointer++;
                rightPointer--;
            } else if (!allowedCharacters.contains(Character.toString(s.charAt(leftPointer)))) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return true;

    }

}
