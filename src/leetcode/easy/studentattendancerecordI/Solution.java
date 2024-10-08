package leetcode.easy.studentattendancerecordI;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean checkRecord(String s) {

        Deque<Character> charDeque = new ArrayDeque<>();
        char[] sCharArray = s.toCharArray();
        int countOfL = 0;
        int countOfA = 0;
        for (char c : sCharArray) {
            if (charDeque.isEmpty()) {
                if (c == 'L') {
                    countOfL++;
                } else if (c == 'A') {
                    countOfA++;
                }
                charDeque.add(c);
            } else if (c == 'A') {
                countOfL = 0;
                countOfA = countOfA + 1;
                charDeque.add(c);
            } else if (c == 'L' && countOfL == 2) {
                return false;
            } else if (c == 'L') {
                countOfL++;
                charDeque.add(c);
            } else {
                countOfL = 0;
                charDeque.add(c);
            }
        }

        return countOfA < 2;
    }
}


// Better solution
//class Solution {
//    public boolean checkRecord(String s) {
//        int absent = 0;
//        int consecLate = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'A') {
//                consecLate = 0;
//                absent++;
//                if (absent == 2) return false;
//            } else if (s.charAt(i) == 'L') {
//                consecLate++;
//                if (consecLate == 3) return false;
//            } else {
//                consecLate = 0;
//            }
//        }
//
//        return true;
//    }
//}