package leetcode.easy.plusone;

public class Solution {
    public int[] plusOne(int[] digits) {
        // Code after revision
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;

            }
            digits[i] = 0;
        }

        int[] returnArray = new int[digits.length + 1];
        returnArray[0] = 1;

        return returnArray;
    }

}

// This code was my first attempt, it does run slightly faster but its way too much unnecessary code.
//        int currentPointer = digits.length -1;
//
//        for (int digit: digits) {
//            if (digits[currentPointer] < 9) {
//                digits[currentPointer] += 1;
//                return digits;
//
//            } else {
//                digits[currentPointer] = 0;
//                currentPointer--;
//            }
//        }
//
//        if (digits[0] == 0) {
//            int[] newArr = new int[digits.length+1];
//            newArr[0] = 1;
//            for (int i = 1; i < digits.length; i++) {
//                newArr[i] = 0;
//            }
//            return newArr;
//        }
//
//        return digits;
//    }

