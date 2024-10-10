package leetcode.easy.fibonaccinumber;

import java.util.Arrays;

public class Solution {
    public int fib(int n) {

        // With Tabulation O(n):
        if (n <= 1) return n;

        int[] tab = new int[n + 1];
        tab[0] = 0;
        tab[1] = 1;

        for (int i = 2; i <= n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        System.out.println(Arrays.toString(tab));

        return tab[n];
    }

    // With Recursion O(2^n):
//        if (n <= 1) return n;
//        return fib(n - 1) + fib(n - 2);
}
