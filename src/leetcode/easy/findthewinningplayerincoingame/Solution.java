package leetcode.easy.findthewinningplayerincoingame;

public class Solution {
    public String losingPlayer(int x, int y) {
        String currentPlayer = "Alice";

        while (x >= 0 && y >= 0) {
            x -= 1;
            y -= 4;
            currentPlayer = currentPlayer.equals("Alice") ? "Bob" : "Alice";
        }

        return currentPlayer;
    }
}
