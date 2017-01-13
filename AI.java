import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tearsyu on 03/11/16.
 */
public class AI {
    public int pickSpot(TicTacToe game){
        ArrayList<Integer> choices = new ArrayList<>();
        for (int i = 0; i < 9; ++i){
            if (game.board[i] == '-'){
                choices.add(i+1);
            }
        }
        Random rand = new Random();
        int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
        return  choice;
    }
}
