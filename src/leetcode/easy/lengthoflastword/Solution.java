package leetcode.easy.lengthoflastword;


public class Solution {
    public int lengthOfLastWord(String s) {
        boolean stopCount = false;
        int wordLetterCount = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (stopCount && s.charAt(i) == ' ') {
                return wordLetterCount;
            }
            if (s.charAt(i) != ' ') {
                stopCount = true;
                wordLetterCount++;
            }
        }

        return wordLetterCount;
    }
}
