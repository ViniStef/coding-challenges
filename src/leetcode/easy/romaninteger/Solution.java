package leetcode.easy.romaninteger;

public class Solution {
    public int romanToInt(String s) {
        int[] numericRepresentation = new int[]{1, 5, 10, 50, 100, 500, 1000};
        String[] romanRepresentation = new String[]{"I", "V", "X", "L", "C", "D", "M"};
        char[] convertedS = s.toCharArray();
        int counter = 0;

        for (int i = 0; i < convertedS.length; i++) {
            String currentCharacter = String.valueOf(convertedS[i]);

            if (i > 0) {
                if (String.valueOf(convertedS[i - 1]).equals("I") && (currentCharacter.equals("V") || currentCharacter.equals("X"))) {
                    counter -= 2;
                } else if (String.valueOf(convertedS[i - 1]).equals("X") && (currentCharacter.equals("L") || currentCharacter.equals("C"))) {
                    counter -= 20;
                } else if (String.valueOf(convertedS[i - 1]).equals("C") && (currentCharacter.equals("D") || currentCharacter.equals("M"))) {
                    counter -= 200;
                }
            }

            for (int j = 0; j < numericRepresentation.length; j++) {
                if (currentCharacter.equals(romanRepresentation[j])) {
                    counter += numericRepresentation[j];
                    break;
                }
            }
        }
        return counter;
    }
}