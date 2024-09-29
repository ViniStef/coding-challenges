package leetcode.easy.validparentheses;

import java.util.ArrayList;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        boolean response = solution.isValid("(([]){})"); // 11342562
        String value ="((";

        boolean response = solution.isValid(value);



        System.out.println(response);
    }




}

