package leetcode.easy.longestcommonprefix;

public class Solution_Attempt2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty()) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();

        int currentLetterIndex = 0;

        whileloop:
        while (currentLetterIndex < strs[0].length()) {
            char currentChar = strs[0].charAt(currentLetterIndex);
            for (String str : strs) {
                if (currentLetterIndex <= str.length()-1) {
                    if (str.charAt(currentLetterIndex) != currentChar) {
                        break whileloop;
                    }
                } else {
                    break whileloop;
                }
            }
            stringBuilder.append(currentChar);
            currentLetterIndex++;
        }

        return stringBuilder.toString();
    }
}
