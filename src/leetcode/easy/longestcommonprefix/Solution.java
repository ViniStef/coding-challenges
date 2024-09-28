package leetcode.easy.longestcommonprefix;

import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean isLetterTheSameAllWords = true;

        if (strs.length == 1) {
            return strs[0];
        }
        char[] firstWord = strs[0].toCharArray();
        String prefix = "";

        for (int i = 0; i < firstWord.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()) {
                    if (firstWord[i] == strs[j].charAt(i)) {
                        isLetterTheSameAllWords = true;
                    } else {
                        isLetterTheSameAllWords = false;
                        break;
                    }
                } else {
                    isLetterTheSameAllWords = false;
                    break;
                }
            }
            if (isLetterTheSameAllWords) {
                prefix += firstWord[i];
            } else {
                break;
            }
        }

        return prefix;
    }

}