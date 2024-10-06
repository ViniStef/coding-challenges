package leetcode.easy.palindromenumber;

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        ArrayList<Integer> backwardsNumberList = new ArrayList<>();
        boolean completed = false;
        int numberDividedWithoutDecimal = x;
        while(!completed) {
            if (numberDividedWithoutDecimal == 0) {
                completed = true;
                break;
            }
            double numberDividedWithDecimal = numberDividedWithoutDecimal / 10D;
            numberDividedWithoutDecimal = numberDividedWithoutDecimal / 10;
            double actualNumber = (numberDividedWithDecimal - numberDividedWithoutDecimal) * 10.1;
            backwardsNumberList.add((int) actualNumber);
        }

        int middleOfList = backwardsNumberList.size() / 2;
        for (int i = 0; i < backwardsNumberList.size(); i++) {
            if (i == middleOfList) {
                return true;
            }
            if (backwardsNumberList.get(i).equals(backwardsNumberList.get(backwardsNumberList.size() - i - 1))) {
                continue;
            }
            return false;
        }

        return false;
    }
}
