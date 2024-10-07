package leetcode.easy.minimumstringlengthafterremovingsubstrings;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int minLength(String s) {
        if (s.length() == 1) {
            return 1;
        }
        char[] charArrayOfS = s.toCharArray();
        Deque<Character> charStack = new ArrayDeque<>();

        for (char character : charArrayOfS) {
            if (charStack.isEmpty()) charStack.push(character);
            else {
                if ((charStack.peek().equals('A') && character == 'B') || charStack.peek().equals('C') && character == 'D') {
                    charStack.pop();
                } else {
                    charStack.push(character);
                }
            }
        }

        return charStack.size();
    }
}
