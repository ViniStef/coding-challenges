package leetcode.easy.removeduplicatesfromsortedarray;

public class Solution {

    //Correct solution
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int currentIndex = 1; //

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }

        return currentIndex;
    }
}

// My old line of thought
//    public int removeDuplicates(int[] nums) {
//        int loopControl = nums.length;
//        int currentNumberIndex = 1;
//        if (nums.length == 2) {
//            if (nums[0] == nums[1]) {
//                return 1;
//            } else {
//                return 2;
//            }
//        }
//
//        while(loopControl > 1) {
//            for (int i = currentNumberIndex; i < loopControl; i++) {
//                if (i == loopControl-1 && i == 1) {
//                    if (nums[i] != nums[i-1]) {
//                        currentNumberIndex++;
//                        break;
//                    }
//                    break;
//                } else if (i == loopControl - 1) {
//                    break;
//                }
//                if (nums[i] == nums[i-1] || nums[i] < nums[i-1]) {
//                    if (nums[i] == nums[i-1] && nums[i] == nums[i+1]) {
//                        if (currentNumberIndex-1 > 0) {
//                            currentNumberIndex--;
//                        }
//                    }
//                    int nextNumber = nums[i+1];
//                    nums[i+1] = nums[i];
//                    nums[i] = nextNumber;
//                } else {
//                    currentNumberIndex++;
//                }
//            }
//            loopControl--;
//        }
//
//        return currentNumberIndex;
//    }