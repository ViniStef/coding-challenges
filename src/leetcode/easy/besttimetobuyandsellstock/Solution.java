package leetcode.easy.besttimetobuyandsellstock;

public class Solution {
    public int maxProfit(int[] prices) {
        int pointerLeft = 0;
        int pointerRight = 1;
        int maxProfit = 0;

        while (pointerRight < prices.length) {
            if (prices[pointerLeft] < prices[pointerRight]) {
                maxProfit = Math.max(maxProfit, prices[pointerRight] - prices[pointerLeft]);
            } else {
                pointerLeft = pointerRight;
            }

            pointerRight++;
        }

        return maxProfit;

    }
}
