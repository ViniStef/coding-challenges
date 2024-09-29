package leetcode.easy.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Deque<Character> characterDeque = new ArrayDeque<>();
        char[] characterArray = s.toCharArray();

        for (char character: characterArray) {
            if (character == '(') {
                characterDeque.addFirst(')');
            } else if (character == '[') {
                characterDeque.addFirst(']');
            } else if (character == '{') {
                characterDeque.addFirst('}');
            } else if (characterDeque.isEmpty() || characterDeque.pop() != character) {
                return false;
            }


        }
        if (!characterDeque.isEmpty()) {
            return false;
        }
        return true;
    }
}