package tictactoeapplication;

import java.util.ArrayList;
import java.util.Random;

class AI {
    public int pickSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            // If the slot is not taken, add it as a choice
            if (game.board[i] == '-'){
                choices.add(i + 1);
            }
        }
        Random rand = new Random();
        return choices.get(Math.abs(rand.nextInt() % choices.size()));
    }
}
