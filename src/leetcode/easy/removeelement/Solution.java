package leetcode.easy.removeelement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int placeToOverride = 0;
        int countNumsDifferentThanVal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (placeToOverride == 0 && nums[i] == val) {
                if (nums[placeToOverride] == val && i != 0) {
                    continue;
                }
                placeToOverride = i;
                continue;
            }
            if (nums[i] != val) {
                nums[placeToOverride] = nums[i];
                placeToOverride++;
                countNumsDifferentThanVal++;
            }
        }

        return countNumsDifferentThanVal;
    }
}


// Alternative solution
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        int index = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] != val){
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        return index;
//    }
//}